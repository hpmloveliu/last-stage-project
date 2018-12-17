package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    //DI
    @Autowired
    private UserMapper userMapper;


    @RequestMapping("queryUser")
    public void queryUser(){
        System.out.println("123213");
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println("user::"+user);
        }
    }
}
