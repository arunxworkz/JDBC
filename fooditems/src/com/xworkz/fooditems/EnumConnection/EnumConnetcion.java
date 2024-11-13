package com.xworkz.fooditems.EnumConnection;

public enum EnumConnetcion {
		
		URL("jdbc:mysql://localhost:3306/fooditems"), USERNAME("root"), PASSWORD("7483079907");
		
		private String value;
		
		private EnumConnetcion(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
}

