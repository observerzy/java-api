package com.zy.javaapi.mapper;

import com.zy.javaapi.bean.UserBean;

public interface UserMapper {
    UserBean getUserInfo(String username,String password);
}
