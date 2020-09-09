package com.ori;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.ori")
@EnableTransactionManagement
@MapperScan("com.ori.mapper")
public class RightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RightServiceApplication.class, args);
	}

}
