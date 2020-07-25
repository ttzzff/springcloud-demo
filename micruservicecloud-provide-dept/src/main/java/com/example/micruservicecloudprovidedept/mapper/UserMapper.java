package com.example.micruservicecloudprovidedept.mapper;



import com.tzf.entitys.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author tangzf
 * @date 2020/4/25
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUser(long id);

    @Insert("Insert into user(name, pwd, sex) value(#{name}, #{pwd}, #{sex})")
    void saveUser(User user);
}
