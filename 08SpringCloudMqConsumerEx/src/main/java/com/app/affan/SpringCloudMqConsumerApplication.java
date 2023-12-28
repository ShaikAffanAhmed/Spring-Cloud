package com.app.affan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringCloudMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMqConsumerApplication.class, args);
	}

}
