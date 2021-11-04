package com.capgemini.domain;
import com.capgemini.interfaces.Shape;

public class Car extends Vehicle implements Shape {
	private int noOfSeats;
	public Car() {
		super();
	}
	public Car(String regNumber, String color, float price, int noOfSeats) {
		super(regNumber, color, price);
		this.noOfSeats = noOfSeats;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public void start() {
		System.out.println("Car is started");
	}
	@Override
	public void stop() {
		System.out.println("Car is stoped");
	}
	
	@Override
	public void display() {	
		super.display();
		System.out.println(" "+noOfSeats);
	}
	@Override
	public void draw() {
		System.out.println("Car is Drawn");
		
	}

}
