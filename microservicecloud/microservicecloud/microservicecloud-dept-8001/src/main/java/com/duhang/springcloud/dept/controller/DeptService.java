package com.duhang.springcloud.dept.controller;



import com.duhang.springcloud.entities.Login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.web.bind.annotation.*;

import com.duhang.springcloud.entities.Dept;


import com.duhang.springcloud.dept.dao.DeptDao;
import lombok.extern.slf4j.Slf4j;


import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value="/dept")
public class DeptService {
	
	@Autowired
	private DeptDao deptDao;


    @RequestMapping(value = "/login")
    public void login(){
        System.out.println("hjkl");




    }


}
