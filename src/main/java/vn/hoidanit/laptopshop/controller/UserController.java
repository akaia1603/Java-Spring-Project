package vn.hoidanit.laptopshop.controller;

import java.util.List;
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
    private final UserService userService;

    // Dùng inpendency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> arrUsers = this.userService.getAllUserByEmai("bmq1603@gmail.com");
        System.out.println(arrUsers);
        return "hello";
    }

    @RequestMapping("/admin/user/create") // default: Get
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping("/admin/user")
    public String getUser(Model model) {
        List<User> users = this.userService.getAllUser();
        model.addAttribute("users1", users);
        return "admin/user/table-user";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    // thuoc tinh nay chinh la form
    public String creatUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
        System.out.println("run here" + hoidanit);
        this.userService.handleSaveUser(hoidanit);
        return "redirect:/admin/user";
    }

}
