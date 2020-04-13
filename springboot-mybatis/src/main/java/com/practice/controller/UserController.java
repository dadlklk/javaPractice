package com.practice.controller;

import com.practice.dao.UserDao;
import com.practice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    //git修改

    @Autowired
    private UserDao userDao;

    @RequestMapping("/find")
    @ResponseBody
    public List<User> findAllUser(){
        List<User> allUser = userDao.findAllUser();
        return allUser;
    }

    @RequestMapping("/find2")
    @ResponseBody
    public List<User> findAllId(){
        List<User> allId = userDao.findAllId();
        return allId;
    }
}
