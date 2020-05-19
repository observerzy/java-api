package com.zy.javaapi.controller;

import com.zy.javaapi.bean.UserBean;
import com.zy.javaapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/testlogin")
    @ResponseBody
    public String show(){
        return "Welcome to test login!";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public  String login(String username,String password){
        UserBean userBean = userService.login(username,password);
        if(userBean!=null){
            return  "success";
        }else {
            return "error";
        }
    }
}
