package com.duhang.springcloud.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Dept implements Serializable {
	
	private Integer id;
	private String name;
	private String source;


}
