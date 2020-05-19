package com.zy.javaapi.serviceImpl;

import com.zy.javaapi.bean.UserBean;
import com.zy.javaapi.mapper.UserMapper;
import com.zy.javaapi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    //@Autowired报错
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean login(String username, String password) {
        return userMapper.getUserInfo(username,password);
    }
}
