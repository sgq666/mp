package com.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mp.mapper.UserMapper;
import com.mp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MpTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }

    @Test
    public void findOne(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void selectPage(){
        Page page = new Page(1,2);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ge("age", 10);
        userQueryWrapper.orderByDesc("age");
        IPage iPage = userMapper.selectPage(page, userQueryWrapper);
        System.out.println(iPage.getTotal());
        List list = iPage.getRecords();
        list.forEach(System.out::println);
    }

    @Test
    public void selectById(){
        User u = userMapper.findById(1L);
        System.out.println(u);
    }


    @Test
    public void select89(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.in("age",18,20);
        List list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

}