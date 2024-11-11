package com.xworkz.bike.internal;

public class Bike {

	public boolean isConnected;
	public int maxGear;
	public int minGear;
	public int cutrrentGear;
	
	public Bike() {
		System.out.println("This is bike class");
	}
	
	public Bike(boolean isConnected, int maxGear, int minGear, int cutrrentGear) {
		super();
		this.isConnected = isConnected;
		this.maxGear = maxGear;
		this.minGear = minGear;
		this.cutrrentGear = cutrrentGear;
	}

	public void on() {
		System.out.println("The bike is on");
	}
	
	public void off() {
		System.out.println("The bike is off");
	}
	
	public void increseGear(int cutrrentGear) {
		if(cutrrentGear <= maxGear) {
			cutrrentGear += 1;
			System.out.println("Gear increased to: "+cutrrentGear);
		}else {
			cutrrentGear = cutrrentGear;
		}
	}
	
	public void decreaceGer(int cutrrentGear) {
		if(cutrrentGear == minGear) {
			cutrrentGear -= 1;
			System.out.println("Gear decreased to: "+cutrrentGear);
		}else {
			cutrrentGear = cutrrentGear;
		}
	}
	
}
