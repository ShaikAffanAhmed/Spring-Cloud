package com.app.affan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudSchedulerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSchedulerServerApplication.class, args);
	}

}
