package com.zpc.item.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //声名这是一个Eureka Client
@ComponentScan(basePackages={"com.zpc"})//扫描路径
public class ItemApp {
	public static void main(String[] args){
		SpringApplication.run(ItemApp.class, args);
	}
}
