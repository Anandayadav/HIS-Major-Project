package com.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MajProjectConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajProjectConfigserverApplication.class, args);
	}

}
