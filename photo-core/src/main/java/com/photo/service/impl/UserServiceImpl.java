package com.photo.service.impl;

import com.photo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "dmc";
    }
}
