package com.example.micruservicecloudprovidedept.controllers;

import com.example.micruservicecloudprovidedept.mapper.UserMapper;

import com.tzf.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangzf
 * @date 2020/4/25
 */
@RestController
@RequestMapping("/user")
public class UserControllers {

    @Autowired(required = false)
    private UserMapper userMapper;


    @RequestMapping("/get/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userMapper.getUser(id);
    }

    @RequestMapping("/get")
    public User get( Long id){
        return userMapper.getUser(id);
    }

    @RequestMapping("/save")
    public String saveUser(@RequestBody User user){
        userMapper.saveUser(user);
        return "保存成功";
    }

}
