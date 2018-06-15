package com.ruiyang.floweryoung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceReportApplication.class, args);
	}	
}
