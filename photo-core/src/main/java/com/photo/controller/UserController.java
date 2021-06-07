package com.photo.controller;

import com.photo.anotation.CurrentUser;
import com.photo.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user/name", method = RequestMethod.GET)
    public String getUserName(@CurrentUser UserInfo userInfo) {
         return "Hello";
    }
}
