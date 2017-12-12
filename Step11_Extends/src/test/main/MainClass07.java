﻿package test.main;

import test.auto.Car;
import test.auto.Taxi;
import test.auto.Truck;

public class MainClass07 {
	public static void main(String[] args) {
		
		Taxi car1 = new Taxi();
		Truck car2 = new Truck();
		
		car1.startEngine(); //Car
		car1.takePassenger(); //Taxi
		car1.drive(); //Car
		
		System.out.println();
		
		car2.startEngine(); //Car
		car2.loadObject(); //Truck
		car2.drive(); //Car
		
		MainClass07.useCar(car1);
		useCar(car2);
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
		
		//car를 Taxi로 cast 할 수 없으므로 ClassCastException이 발생한다.
		Taxi t = (Taxi)car;
		t.takePassenger();
	}
}
