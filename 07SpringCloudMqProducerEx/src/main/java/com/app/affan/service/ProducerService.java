package com.app.affan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;

@Component
public class ProducerService {

	@Autowired
	private JmsTemplate template;
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	public void send(String message)
	{
//		jt.send(destination, session -> session.createTextMessage(message));
//		System.out.println("MESSAGE SENT FROM PROCEDURE " + message);
		
        /* 	template.send(destination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
            TextMessage tm = session.createTextMessage(message);
				return tm;
			}
		} ); */
		template.send(destination,session->
		session.createTextMessage(message));
		System.out.println("Message Sent");
	}
}
