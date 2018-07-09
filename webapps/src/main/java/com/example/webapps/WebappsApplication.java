package com.example.webapps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.webapps.mapper")
public class WebappsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappsApplication.class, args);
	}
}
