package com.example.micruservicecloudprovidedept.controllers;

import com.example.micruservicecloudprovidedept.mapper.GoodsMapper;
import com.tzf.entitys.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangzf
 * @date 2020/5/9
 */
@RequestMapping("/goods")
@RestController
public class GoodsControllers {

    @Autowired
    private GoodsMapper goodsMapper;

    @RequestMapping("/get")
    public Object get(int id){
        return goodsMapper.get(id);
    }

    @RequestMapping("/save")
    public String save(Goods goods){
        goodsMapper.save(goods);
        return "成功";
    }



}
