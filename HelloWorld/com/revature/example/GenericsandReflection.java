package com.revature.example;
import java.util.Arrays;

import com.revature.transport.Car;
import com.revature.transport.MaintenanceException;
import com.revature.transport.Tornado;

public class GenericsandReflection {

	public static void main(String[] args) {
		Car c = new Car(2300, "Fury Roadster", "Mad Max", 1000);
		Object[] emptyCars = (Car[]) replicate(c,3);
		try{
			((Car) emptyCars[2]).move();
		}
			catch (MaintenanceException e) {
				e.printStackTrace();
			}
		funWithReflections();
		
	}
	//fills an array of specified size with objects of the same type as passed in
	static Object[] replicate(Object o,int size) {
		Object[] replicants = new Object[size];
		for (int i = 0; i<size; i++) {
			replicants[i]= new Object();
		}
		return replicants;
	}
	
	static <T> Object[] replicateWithGenerics(T t, int size) throws InstantiationException, IllegalAccessException
	{
		Object[] replicants = new Object[size]; 
	for (int i = 0; i<size; i++) {
		replicants[i]= (t.getClass()).newInstance();
	}
	return replicants;
	}
	/*
	 * time to use the reflection API!
	 * allows us to perform a runtime check on a variables type
	 * and do so much more
	 * can inspect, use the classes name to mess with its fields, get its methods
	 */
	static void funWithReflections() {
		 try {
			Class clazz = Class.forName("com.revature.transport.Tornado");
			System.out.println(clazz.getSimpleName());
		}	catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		 //new instance of Tornado
		 Field[] fields = clazz.getDeclaredFields();
		 Tornado t = (Tornado) clazz.newInstance();
	}
}
		

