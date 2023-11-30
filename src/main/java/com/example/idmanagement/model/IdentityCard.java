package com.example.idmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class IdentityCard {
	@Id
	@Column(name = "id_number")
	private Integer idNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Integer age;
}
