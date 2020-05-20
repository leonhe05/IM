package com.graduationProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis mapper包的路径
@MapperScan(basePackages = "com.graduationProject.mapper")
@ComponentScan(basePackages= {"com.graduationProject", "org.n3r.idworker"})
public class Application {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
