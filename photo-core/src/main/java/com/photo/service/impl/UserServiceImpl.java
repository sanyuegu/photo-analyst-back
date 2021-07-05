package com.photo.service.impl;

import com.photo.entity.UserInfo;
import com.photo.mapper.UserInfoMapper;
import com.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getByName(String username) {
        return userInfoMapper.findByUsername(username);
    }
}
