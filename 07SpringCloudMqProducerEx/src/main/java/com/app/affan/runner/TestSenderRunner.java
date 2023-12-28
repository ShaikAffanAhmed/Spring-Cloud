package com.app.affan.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.app.affan.service.ProducerService;

@Component
public class TestSenderRunner {
//implements CommandLineRunner{

	@Autowired
	private ProducerService service;
	
	//public void run(String... args) throws Exception {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendMsgTest()  throws Exception {
		service.send("HI " + new Date());
	}

}
