package com.app.affan.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.app.affan.service.ProducerService;

public class TestProducer {

	@Autowired
	private ProducerService service;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendTestData() {
	  service.send("Hi" + new Date());	
	}
}
