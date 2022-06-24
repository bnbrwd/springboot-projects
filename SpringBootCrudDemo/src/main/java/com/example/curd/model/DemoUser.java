package com.example.curd.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection ="UserDetails")
public class DemoUser {
	@Id
	private int id;
	private String name;
	private String city;
	private String status;
}


