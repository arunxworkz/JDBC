package com.xworkz.bike.external;

import com.xworkz.bike.internal.Bike;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.isConnected = true;
		bike.maxGear = 5;
		bike.minGear = 1;
		if(bike.isConnected) {
			bike.on();
			bike.increseGear(2);
			bike.off();
			bike.decreaceGer(1);
		}else {
			bike.off();
		}
		
		
	}

}
