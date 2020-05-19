package com.zy.javaapi.service;

import com.zy.javaapi.bean.UserBean;

public interface UserService {
    UserBean login(String username,String password);
}
