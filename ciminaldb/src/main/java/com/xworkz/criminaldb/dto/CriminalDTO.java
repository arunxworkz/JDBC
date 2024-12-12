package com.xworkz.criminaldb.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class CriminalDTO {


    int id;
    String ciminal_name;
    int criminal_age;
    float section_applied;
    String criminal_hometown;



}
