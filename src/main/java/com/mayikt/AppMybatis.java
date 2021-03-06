package com.mayikt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mayikt.mapper")
public class AppMybatis {

	public static void main(String[] args) {
		SpringApplication.run(AppMybatis.class, args);
	}

}
