package com.xworkz.bookingdetails.dbconnection;

public enum Dbconnection {

    URL("jdbc:mysql://localhost:3306/bookingdetails"), USERNAME("root"), PASSWOORD("7483079907");

    private String value;

    private Dbconnection(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
