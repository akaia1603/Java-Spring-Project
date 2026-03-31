package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import vn.hoidanit.laptopshop.domain.User;
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
    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value="/admin/user/create1", method = RequestMethod.POST)
    // thuoc tinh nay chinh la form
    public String creatUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
        System.out.println("run here" + hoidanit);
        return "hello";
    }

}
