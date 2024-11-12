package com.xworkz.codeforge.runner;

public enum EnumConnection {
URL("jdbc:mysql://localhost:3306/events"), USERNAME("root"), PASSWORD("7483079907");
	
	private final  String value;
	
	private EnumConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
