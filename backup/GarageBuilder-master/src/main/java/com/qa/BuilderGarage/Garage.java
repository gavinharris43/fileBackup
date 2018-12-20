package com.qa.BuilderGarage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public Garage() {
		
	}
	
	public void addToGarage(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void removeFromGarage(Vehicle vehicle) {
		for (Vehicle currentVehicle : vehicleList) {
			if(vehicle.canFly == true) {
				vehicleList.remove(currentVehicle);
			}
		}
	}
	
	public void billVehicles() {
		for (Vehicle currentVehicle : this.vehicleList) {
			if (currentVehicle.typeOfVehicle.equals("car")) {
				currentVehicle.bill += 10;
			}
			if (currentVehicle.typeOfVehicle.equals("plane")) {
				currentVehicle.bill += 100;
			}
			if (currentVehicle.typeOfVehicle.equals("motorbike")) {
				currentVehicle.bill += 3;
			}
		}
	}

}
