package com.example.micruservicecloudprovidedept.service;

import com.example.micruservicecloudprovidedept.mapper.GoodsMapper;
import com.tzf.entitys.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tangzf
 * @date 2020/5/16
 */
@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    private Goods getGoods(Integer id){
        return goodsMapper.get(id);
    }

}
