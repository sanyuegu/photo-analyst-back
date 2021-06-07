package com.photo.security;

import com.photo.anotation.CurrentUser;
import com.photo.entity.UserInfo;
import com.photo.util.UserInfoContextHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


public class MasterPrincipalArgumentResolver implements HandlerMethodArgumentResolver {
    @Autowired
    private UserInfoContextHelper userInfoContextHelper;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterAnnotation(CurrentUser.class) != null && methodParameter.getParameterType().equals(UserInfo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("登录一下");
        return userInfo;//userInfoContextHelper.getCurrentUserInfo();
    }
}
