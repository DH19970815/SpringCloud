package com.duhang.springcloud.dept.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.duhang.springcloud.entities.Dept;


import com.duhang.springcloud.dept.dao.DeptDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/dept")
public class DeptService {
	
	@Autowired
	private DeptDao deptDao;

	@GetMapping(value = "/addDept")
    public int addDept(@RequestBody Dept dept){
	    System.out.println("11111111");
		return deptDao.addDept(dept);
    }




}
