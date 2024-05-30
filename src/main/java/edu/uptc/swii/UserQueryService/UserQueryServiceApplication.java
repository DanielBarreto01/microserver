package edu.uptc.swii.UserQueryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserQueryServiceApplication.class, args);
	}

}
