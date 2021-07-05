package com.photo.controller;

import com.photo.anotation.CurrentUser;
import com.photo.entity.UserInfo;
import com.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagerController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/manager/{username}", method = RequestMethod.GET)
    public UserInfo getUserName(@PathVariable String username, @CurrentUser UserInfo userInfo) {
        return userService.getByName(username);
    }
}
