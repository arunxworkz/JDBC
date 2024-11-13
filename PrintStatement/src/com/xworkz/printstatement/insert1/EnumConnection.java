package com.xworkz.printstatement.insert1;

public enum EnumConnection {
	
	URL("jdbc:mysql://localhost:3306/plasticbottle"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private EnumConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
