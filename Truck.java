package com.capgemini.domain;

import com.capgemini.interfaces.Shape;

public  class Truck extends Vehicle implements Shape{
        private int loadCapacity;
		public Truck() {
			super();
		}
		public Truck(String regNumber, String color, float price, int loadCapacity) {
			super(regNumber, color, price);
			this.loadCapacity = loadCapacity;
		}
		public int getLoadCapacity() {
			return loadCapacity;
		}
		public void setLoadCapacity(int loadCapacity) {
			this.loadCapacity = loadCapacity;
		}
		
		@Override
		public void start() {
			
			System.out.println("Truck is started");
		}
		@Override
		public void stop() {
			System.out.println("Truck is stoped");
		}
		
		public void display() {
			super.display();
			System.out.println(" "+loadCapacity);
		}
		@Override
		public void draw() {
			System.out.println("Truck Is drawn");
			
		}
		
        
}
