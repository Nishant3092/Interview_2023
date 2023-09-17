package com.concentrix.nish;


public class Car extends Vehicle{

	public void run() {
		System.out.println("Car Is Running");
	}

	public static void main(String[] args) {
		
Vehicle vehicle = new Car();
Car car = new Car();
vehicle.run();
car.run();
	}

}
