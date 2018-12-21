package com.revature.transport;



public class Boat extends Vehicle {

	public Boat() {
		// TODO Auto-generated constructor stub
		System.out.println("Boat no args constructor completed");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I'm on a boooooooaaaaaatttttt!");
	}

	protected String color;
	protected double hullLengthinMeters;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Boat(String color, double hullLengthinMeters) {
		super();
		this.color = color;
		this.hullLengthinMeters = hullLengthinMeters;
	}

}
