package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {
@Id

	private int id;
	private String number;
@OneToOne(cascade = CascadeType.ALL)
	private Student student; 
}
