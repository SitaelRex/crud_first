package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.model.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        //userService.saveUser(new User());
        //userService.saveUser(new User());
    }

    public UserController() {

    }

    @GetMapping("/")
    public String indexUsers(ModelMap model) {
        model.addAttribute("users", userService.getUsersList());
        return "users/index";
    }

    @GetMapping("/{id}")
    public String showUser(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("user", userService.getUser(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String newUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "users/new";
    }
    @PostMapping("/")
    public String createUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editUser(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("user",userService.getUser(id));
        return "users/edit";
    }
    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.updateUser(id,user);
        return "redirect:/";
    }
    @DeleteMapping("/{id}")
    public  String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser((long)id);
        return "redirect:/";
    }
}
