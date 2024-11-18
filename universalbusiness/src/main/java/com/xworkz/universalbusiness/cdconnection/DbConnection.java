package com.xworkz.universalbusiness.cdconnection;

public enum DbConnection {
	
	URL("jdbc:mysql://localhost:3306/business"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private DbConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
