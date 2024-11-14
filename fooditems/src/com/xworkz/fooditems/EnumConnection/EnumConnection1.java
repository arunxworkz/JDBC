package com.xworkz.fooditems.EnumConnection;

public enum EnumConnection1 {
	URL("jdbc:mysql://localhost:3306/newrunner"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private EnumConnection1(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
