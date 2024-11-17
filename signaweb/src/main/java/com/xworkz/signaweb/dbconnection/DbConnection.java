package com.xworkz.signaweb.dbconnection;

public enum DbConnection {
	
	URL("jdbc:mysql://localhost:3306/signabase"), USERNAME("root"), PASSWORD("7483079007");
	
	private String value;
	
	private DbConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
