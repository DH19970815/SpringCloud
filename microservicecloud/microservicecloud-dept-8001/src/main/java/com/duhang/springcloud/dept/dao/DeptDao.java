package com.duhang.springcloud.dept.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.duhang.springcloud.entities.Dept;

@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);
	public List<Dept> findAll();
	public Dept findId(Dept dept);
	public Dept findIdTwo(Integer id);
	public boolean update(Dept dept);
}
