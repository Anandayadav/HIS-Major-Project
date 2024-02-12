package com.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MajProjectServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajProjectServiceregistryApplication.class, args);
	}

}
