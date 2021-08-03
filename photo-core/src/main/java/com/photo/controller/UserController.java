package com.photo.controller;

import com.photo.anotation.CurrentUser;
import com.photo.anotation.PhotoController;
import com.photo.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@PhotoController
public class UserController {

    @RequestMapping(value = "/user/name", method = RequestMethod.GET)
    public String getUserName(@CurrentUser UserInfo userInfo) {
        return "Hello";
    }
}
