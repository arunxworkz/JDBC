package com.xworkz.criminaldb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CriminalDTO {

	private int id;
	private String ciminal_name;
	private int criminal_age;
	private float section;
	private String criminal_hometown;
	
}
