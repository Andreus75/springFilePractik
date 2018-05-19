package ua.com.owu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/givMeAllUsers")
    public List<User> allUsersMethod(){
        return userService.findAll();
    }
}
