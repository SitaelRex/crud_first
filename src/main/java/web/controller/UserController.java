package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.model.UserServiceImpl;

@Controller
public class UserController {
    //@Autowired
   // private UserServiceImpl userService;

    public UserController() {
       // userService.saveUser(new User());
       // userService.saveUser(new User());
    }

    @GetMapping(value = "/users")
    public String userTest(ModelMap model) {
        return "users";
    }
}
