package com.revature.vacation;

import com.revature.transport.*; //imports all classes in the package
//to get a specific class, use import package.classname;

//static imports within a class
import static com.revature.transport.Car.*;

public class GoOnVacation {

	public static void main(String[] args) {
		System.out.println("Let's go to Miami!");
		System.out.println("we need a car");
		// fully qualified classname of Car (package plus the classname)
		// com.revature.transport.Car c = new com.revature.transport.Car();
		// or we could use imports ......save us typing!!!

		Car c = new Car(2021, "spaceship", "Tesla", 50);
		System.out.println(c);
		System.out.println(c.toString()); // tostring gives a string representation of heap location of object until
											// overloaded
		System.out.println("do we need to change the oil first?");
		System.out.println("recommended miles between oil changes: " + Car.recommendedMiBtwnOilChanges);
		if (c.getMilesSinceOilChange() >= Car.recommendedMiBtwnOilChanges) {
			System.out.println("Stop change your oil!");
		} else {
			System.out.println("Good to go");
		}

		System.out.println("made it to Miami, let's go kayaking");
		Kayak k = new Kayak();

	}

	@Override
	public String toString() {
		return "GoOnVacation [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
