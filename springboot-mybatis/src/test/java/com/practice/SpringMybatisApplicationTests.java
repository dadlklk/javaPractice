package com.practice;

import com.practice.dao.UserDao;
import com.practice.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringMybatisApplication.class)
class SpringMybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        List<User> allId = userDao.findAllId();
        System.out.println(allId);
    }

}
