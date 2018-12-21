package com.revature.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.revature.transport.*;
public class Comparisons {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2021, "spaceship", "Tesla", 50));
		carList.add(new Car(2018, "spacecraft", "Hyundai", 50));
		carList.add(new Car(2007, "Fancy", "Cadillac", 50));
		System.out.println(carList.get(0).compareTo(carList.get(2)));
		System.out.println("Cars before sort: ");
		for (Car c: carList) {
			System.out.println(c);
		}
	sortWithComparable(carList);
	}
	static List<Car> sortWithComparable(List<Car> carList){
		Collections.sort(carList);
		System.out.println("Cars before sort: ");
		for (Car c: carList) {
			System.out.println(c);
		}
		return carList;
		
		static void sortWithComparator(List<Car> carList, Comparator c) {
			Collections.sort(carList C);
			System.out.println("Cars after sort with "+c.getClass()+ ":");
			for (Car car: carList) {
				System.out.println(car);
			}
		}
	}
}
