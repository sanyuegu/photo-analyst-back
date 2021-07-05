package com.photo.service;

import com.photo.entity.UserInfo;

public interface UserService {
    UserInfo getByName(String username);
}
