package com.ensim.TP3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private Long id;
	private Date creation;
	private String content;
}
