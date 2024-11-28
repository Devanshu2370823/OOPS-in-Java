package com.cts.learning.oops;

public class Main {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.setMake("tesla");
//		car.make = "BMW"; -> Can not do this.
//		System.out.println("make " + car.make); -> This is also invalid.
//		System.out.println("make "+ car.getMake());
//		System.out.println("make "+ car.getModel());
//		car.describeCar();
		
		
		GetSet obj = new GetSet();
//		obj.setName("Devanshu");
//		System.out.println(obj.getName());
		obj.name = "Pani";
		System.out.println(obj.name);
	}
}

