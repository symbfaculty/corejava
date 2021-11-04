package com.capgemini.domain;

public abstract class Vehicle {

	private String regNumber;
	private String color;
	private float price;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String regNumber, String color, float price) {
		super();
		this.regNumber = regNumber;
		this.color = color;
		this.price = price;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	 public abstract  void start();
	 public abstract  void stop();
	
	public void display() {
		
		System.out.print(" "+regNumber+"  "+color+" "+price);
	}
	
}
