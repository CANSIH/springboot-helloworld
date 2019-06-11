package com.hecg.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

	
	public static void main(String[] args) {
		System.out.println("开始启动spring boot........");
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
		System.out.println("spring boot启动完成........");
	}
}
