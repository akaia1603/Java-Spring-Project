package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import vn.hoidanit.laptopshop.service.UserService;

// class này biến thành controller
@Controller
public class UserController {
    // Khai bao service để sử dụng
    private UserService userService;

    // Dùng inpendency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage() {
        this.userService.handleHello();
        return "hello";
    }

}
