package com.photo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
//@Table(name = "user_basicinfo")
public class UserInfo {
//    @Id
//    @Column(name = "user_id")
//    private Long userId;
//    @Column(name = "user_nm")
//    private String username;
//    @Column(name = "password")
//    private String password;
//    @Column(name = "nickname")
//    private String nickname;
//    @Column(name = "gender")
//    private Long gender;
//    @Column(name = "phone")
//    private String phone;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "is_del")
//    private Long isDel;
//    @Column(name = "updt_by")
//    private Long updateBy;
//    @Column(name = "updt_dt")
//    private LocalDateTime updateDate;

    private Long userId;
    private String username;
    private String password;
    private String nickname;
    private Long gender;
    private String phone;
    private String email;
    private Long isDel;
    private Long updateBy;
    private LocalDateTime updateDate;
}
