package vn.hoidanit.laptopshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

// class này biến thành controller
@RestController
public class UserController {
    //Khai bao service để sử dụng
    private UserService userService;
    // Dùng inpendency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }


    
    @GetMapping("")
    public String getHomePage() {
        return this.userService.handleHello();
    }




    
}
