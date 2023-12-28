package com.app.affan.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document //optional annotation
public class Student {

	private String id;
	private String name;
	private Double fee;
}
