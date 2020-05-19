package com.zy.javaapi;

import com.zy.javaapi.bean.UserBean;
import com.zy.javaapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavaApiApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void textSql() {
        UserBean userBean = userService.login("qiankong","az15819945574");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getUserId());
    }

    @Test
    void contextLoads() {
        System.out.println("contextLoads");
    }

}
