package com.app.affan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.affan.db.MessageStore;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConsumerService {

	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${my.topic.name}",groupId = "abcd")
	public void readMessage(String message)
	{
		log.info("MESSAGE AT CONSUMNER : {}", message);
		store.add(message);
	}
	
}
