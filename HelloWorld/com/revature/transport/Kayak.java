package com.revature.transport;

public class Kayak extends Boat {

	public Kayak() {
		// TODO Auto-generated constructor stub
		System.out.println("Kayak no args constructor completed");
	}

	public Kayak(String color, double hullLengthinMeters, int numSeats, double paddleLengthInMeters) {
		super();
		this.numSeats = numSeats;
		this.paddleLengthInMeters = paddleLengthInMeters;
	}


	private int numSeats;
	private double paddleLengthInMeters;
	
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public double getPaddleLengthInMeters() {
		return paddleLengthInMeters;
	}
	public void setPaddleLengthInMeters(double paddleLengthInMeters) {
		this.paddleLengthInMeters = paddleLengthInMeters;
	}
}
