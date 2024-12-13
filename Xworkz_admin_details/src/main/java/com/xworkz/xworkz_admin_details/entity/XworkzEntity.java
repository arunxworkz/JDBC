package com.xworkz.xworkz_admin_details.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Data
@Table(name = "details")
@RequiredArgsConstructor
public class XworkzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "confirm_password")
    String confirmPassword;
    @Column(name = "phno")
    long phno;



}
