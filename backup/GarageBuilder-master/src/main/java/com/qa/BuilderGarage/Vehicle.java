package com.qa.BuilderGarage;

public class Vehicle {

	public int noOfWheels;
	public int noOfSeats;
	public String name;
	public String typeOfVehicle;
	public int age;
	public int noOfWings;
	public boolean canFly;
	public int bill;

	public static class VehicleBuilder {
		
		private int noOfWheels;
		private int noOfSeats;
		private String name;
		private String typeOfVehicle;
		private int age;
		private int noOfWings;
		private boolean canFly;
		private int bill;
		
		public VehicleBuilder withNoOfWheels(int noOfWheels) {
			this.noOfWheels = noOfWheels;
			
			return this;
		}
		
		public VehicleBuilder withNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
			
			return this;
		}
		
		public VehicleBuilder withName(String name) {
			this.name = name;
			
			return this;
		}
		
		public VehicleBuilder withTypeOfVehicle(String typeOfVehicle) {
			this.typeOfVehicle = typeOfVehicle;
			
			return this;
		}
		
		public VehicleBuilder withAge(int age) {
			this.age = age;
			
			return this;
		}
		
		public VehicleBuilder withNoOfWings(int noOfWings) {
			this.noOfWings = noOfWings;
			
			return this;
		}
		
		public VehicleBuilder withCanFly(boolean canFly) {
			this.canFly = canFly;
			
			return this;
		}
		
		public VehicleBuilder withBill(int bill) {
			this.bill = bill;
			
			return this;
		}
		
		public Vehicle build() {
			Vehicle vehicle = new Vehicle();
			vehicle.noOfWheels = this.noOfWheels;
			vehicle.noOfSeats = this.noOfSeats;
			vehicle.name = this.name;
			vehicle.typeOfVehicle = this.typeOfVehicle;
			vehicle.age = this.age;
			vehicle.noOfWings = this.noOfWings;
			vehicle.canFly = this.canFly;
			vehicle.bill = this.bill;
			
			return vehicle;
		}

	}
	
	private Vehicle() {
		
	}

}
