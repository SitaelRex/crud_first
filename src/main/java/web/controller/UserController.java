package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.model.UserService;
import web.model.UserServiceImpl;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
       this.userService = userService;
        userService.saveUser(new User());
        userService.saveUser(new User());
    }

    public UserController() {

    }

    @GetMapping(value = "/users")
    public String userTest(ModelMap model) {
        return "users";
    }
}
