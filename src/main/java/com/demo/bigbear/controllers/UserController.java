package com.demo.bigbear.controllers;

import com.demo.bigbear.models.User;
import com.demo.bigbear.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/")
    public User getUser(@RequestParam(value = "firstname") String firstname,
                        @RequestParam(value = "lastname") String lastname,
                        @RequestParam(value = "age") int age) {
        User user = new User();

        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping(path = "/")
    public User postUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping(path = "/list")
    public List<User> getUser(@RequestParam(required = false, name = "keyword") String keyword) {
        System.out.println("query by keyword:" + keyword);
        return userService.getList(keyword);
    }
}
