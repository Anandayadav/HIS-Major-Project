package com.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@FeignClient
public class MajprojectCitizenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajprojectCitizenapiApplication.class, args);
	}

}
