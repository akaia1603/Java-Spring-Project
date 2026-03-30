package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
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
    public String getHomePage(Model model) {
        System.out.println("------ HOMEPAGE CALLED ------");
        String test = this.userService.handleHello();
        model.addAttribute("eric", test);
        model.addAttribute("minhquan", "Quan thich Anh Thu lam");
        return "hello";
    }

}
