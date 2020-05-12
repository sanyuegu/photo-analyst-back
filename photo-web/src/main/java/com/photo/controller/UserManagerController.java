package com.photo.controller;

import com.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagerController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/manager", method = RequestMethod.GET)
    public String getUserName() {
        return userService.getName();
    }
}