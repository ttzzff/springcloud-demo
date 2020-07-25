package com.example.micruservicecloudprovidedept.mapper;


import com.tzf.entitys.Goods;
import org.apache.ibatis.annotations.Insert;

/**
 * @author tangzf
 * @date 2020/5/9
 */
public interface GoodsMapper {

    //@Select("select * from goods where id = #{id}")
    Goods get(Integer id);

    @Insert("insert into goods (name, code) value(#{name}, #{code})")
    int save(Goods goods);

}
