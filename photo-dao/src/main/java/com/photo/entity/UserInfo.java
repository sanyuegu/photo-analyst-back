package com.photo.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserInfo {
    private String username;
    private Long userId;
    private Long credits;
    private String password;
    private LocalDate lastVisit;
    private String lastIp;
}
