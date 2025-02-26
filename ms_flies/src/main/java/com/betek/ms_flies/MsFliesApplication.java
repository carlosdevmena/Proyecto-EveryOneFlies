package com.betek.ms_flies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFliesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFliesApplication.class, args);
	}

}
