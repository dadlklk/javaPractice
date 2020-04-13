package com.practice.dao;

import com.practice.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public List<User> findAllUser();

    @Select("select id from user")
    public List<User> findAllId();
}
