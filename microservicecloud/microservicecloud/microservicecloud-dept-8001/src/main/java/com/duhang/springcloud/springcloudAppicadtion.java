package com.duhang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.duhang.springcloud")
@EnableCaching
public class springcloudAppicadtion {
	
	public static void main(String[] args) {
		SpringApplication.run(springcloudAppicadtion.class, args);
	}

}
