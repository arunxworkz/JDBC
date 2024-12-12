package com.xworkz.criminaldb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "criminal_details")
@RequiredArgsConstructor

public class CriminalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "criminal_name")
	private String criminal_name;
	@Column(name = "criminal_age")
	private int criminal_age;
	@Column(name = "section_applied")
	private float section_applied;
	@Column(name = "criminal_hometown")
	private String criminal_hometown;	
}
