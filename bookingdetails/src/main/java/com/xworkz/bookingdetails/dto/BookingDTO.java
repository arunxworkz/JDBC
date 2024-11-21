package com.xworkz.bookingdetails.dto;

public class BookingDTO {
    String name;
    String email;
    String password;
    String phNo;
    int age;
    String aadNo;

    public BookingDTO(String name, String email, String password, String phNo, int age, String addNo){
        this.name = name;
        this.email = email;
        this.password = password;
        this.phNo = phNo;
        this.age = age;
        this.aadNo = addNo;
    }

    public BookingDTO(String phNo){
        this.phNo = phNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPhNo(){
        return phNo;
    }

    public void setPhNo(String phNo){
        this.phNo = phNo;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAadNo(){
        return aadNo;
    }

    public void setAadNo(String aadNo){
        this.aadNo = aadNo;
    }

    @Override
    public String toString() {
        return phNo;
    }
}
