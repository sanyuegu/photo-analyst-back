package com.photo.mapper;

import com.photo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    UserInfo findByUsername(String username);
}
