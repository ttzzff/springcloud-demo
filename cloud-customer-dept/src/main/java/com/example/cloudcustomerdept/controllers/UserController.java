package com.example.cloudcustomerdept.controllers;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tzf.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangzf
 * @date 2020/5/17
 */
@RequestMapping("/user")
@RestController
public class UserController {

    //private static String URL = "http://localhost:8080/user";
    private static String URL = "http://localhost:8080/user";

    /**
     * 使用restTemplate访问restful接口
     * (url, requestMap, ResponseBean.class) 三个参数分别代表 REST请求地址、请求参数、HTTP响应类型
     */
    @Autowired
    private RestTemplate restTemplate;

        @GetMapping("/get/{id}")
        public User get(@PathVariable Integer id) {
            return restTemplate.getForObject(URL+"/get/"+id, User.class);
        }

        @GetMapping("/get")
        public User getById(Integer id){
            Map<String, Object> map = new HashMap<>();
            map.put("id", id);
            return restTemplate.getForObject(URL+"/get?id={id}", User.class, map);
        }


        @PostMapping("/save")
        public String save(@RequestBody User user){

        return restTemplate.postForObject(URL+"/save",user, String.class);
    }

}
