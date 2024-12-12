package com.xworkz.criminaldb.entity;


import lombok.Data;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Data
@Entity
@Table(name = "criminal_details")
public class CriminalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "criminal_name")
    private String criminal_name;
    @Column(name = "criminal_age")
    private int age;
    @Column(name = "section_applied")
    float section_applied;
    @Column(name = "criminal_hometown")
    String criminal_hometown;
}
