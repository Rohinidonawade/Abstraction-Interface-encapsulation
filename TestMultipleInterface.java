package com.vstl.oopsInterfaceMultipleInheritance;

public class TestMultipleInterface {

	public static void main(String[] args) {

		Vehicle objVehicle = new Vehicle();
		objVehicle.getStart();
		objVehicle.getStop();
		objVehicle.getRefuel();
		
		System.out.println("*************************");
		
		BMWCar objBmwCar = new Vehicle();
		System.out.println("The wheel is :" +objBmwCar.intWheel);
		objBmwCar.getStart();
		objBmwCar.getRefuel();
		
		System.out.println("*************************");

		ToyotaCar objToyotaCar = new Vehicle();
		System.out.println("The wheel is :" +objToyotaCar.intWheel);
		objToyotaCar.getStart();
		objToyotaCar.getStop();
	}
}
