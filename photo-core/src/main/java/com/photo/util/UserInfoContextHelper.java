package com.photo.util;

import com.photo.entity.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserInfoContextHelper {
    private static final ThreadLocal<UserInfo> USER_INFO_THREAD_LOCAL = new ThreadLocal<>();


    // 清除信息
    public static void clearUserInfo() {
        USER_INFO_THREAD_LOCAL.set(null);
    }

    public void getCurrentUserInfo() {
//        UserInfo userInfo = USER_INFO_THREAD_LOCAL.get();
//        if (userInfo == null) {
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            if (authentication == null) {
//                Object principal = authentication.getPrincipal();
//                if (principal instanceof UserDetails) {
//                    UserDetails userDetails = (UserDetails) principal;
//                    userInfo = new UserInfo();
//                    userInfo.setUsername(userDetails.getUsername());
//                }
//
//                USER_INFO_THREAD_LOCAL.set(userInfo);
//            }
//        }
//
//        return userInfo;
    }
}
