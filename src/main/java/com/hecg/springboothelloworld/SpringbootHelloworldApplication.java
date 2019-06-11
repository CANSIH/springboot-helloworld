package com.hecg.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

	
	public static void main(String[] args) {
		System.out.println("=========================spring boot 开始启动=========================");
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
		System.out.println("=========================spring boot 启动完成=========================");
	}
}
