package com.revature.example;

import com.revature.transport.*;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Car myCar = new Car(2021,"Elantra","Hyundai",50);
		
		
		//drove around for a bit
		myCar.setMilesSinceOilChange(10000);
		try {
			myCar.move();
		} catch(MaintenanceException m) {
			m.printStackTrace();
			//myCar.setMilesSinceOilChange(0);
		}
		//create new Car object
		//in car, change overridden move() from vehicle so that a MaintenanceException can be thrown if oil has not
		//been changed recently
	}
}

