package com.photo.security;

import com.photo.entity.UserInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class PhotoUserDetails extends UserInfo implements UserDetails {
    private String username;
    private String password;

    public PhotoUserDetails() {
    }

    public PhotoUserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //下面这个工具类是spring security提供的，逗号隔开的权限字符串转换为AuthorityList
        // 让每个用户都具有admin和common的权限
        return AuthorityUtils.commaSeparatedStringToAuthorityList("admin,common");
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        //返回true代表账号没有过期
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //返回true代表账号没有锁定
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //返回true代表账号的密码没有过期
        return true;
    }

    @Override
    public boolean isEnabled() {
        //返回true代表账号可用
        return true;
    }
}
