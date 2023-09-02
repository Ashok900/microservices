package com.ex.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringOpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenfeignApplication.class, args);
	}

}
