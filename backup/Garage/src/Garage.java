import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private double spaces;
	private static List<Vehicle> listVehicle = new ArrayList<>();

	public Garage(double spaces) {
		this.spaces = spaces;
	}

	public String addVehicle(Vehicle vehicle) {
		if (listVehicle.size() < spaces) {
			listVehicle.add(vehicle);
			return "Added! :: " + vehicle;
		} else {
			return "Garage Full! Not Added! ::  " + vehicle;
		}
	}
	
	
	public String removeAll() {
		listVehicle.removeAll(listVehicle);
		return "All Vehicles Removed";
		}

	public String removeVehicle(String reg) {
		listVehicle.removeAll(
				listVehicle.stream().filter(v -> v.getRegistration().equals(reg)).collect(Collectors.toList()));
		return "removed";
	}

	public void cost(double time) {
		// List<Vehicle> tempList = new ArrayList<>();
		for (Vehicle vehicle : listVehicle) {
			double lengthMeters = vehicle.getLengthMeters();
			double wheels = vehicle.getWheels();
			double parkingCost =0;
			
			if (vehicle instanceof Car) {
			 parkingCost = lengthMeters * wheels * time;	
			 System.out.println(vehicle + "Cost: " + parkingCost);
			} 
			if (vehicle instanceof Van) {
				 parkingCost = lengthMeters * wheels * time * 1.5;	
				 System.out.println(vehicle + "Cost: " + parkingCost);
				}
			if (vehicle instanceof Bike) {
				 parkingCost = lengthMeters * wheels * time * 0.8;
			System.out.println(vehicle + "Cost: " + parkingCost);

				}
				}

	}

	public void cost(double time, String reg) {
		List<Vehicle> tempList = listVehicle.stream().filter(vehicle -> vehicle.getRegistration().equals(reg))
				.collect(Collectors.toList());
		double parkingCost = 0;
		if (tempList.size() == 0) {
			System.out.println("Cost Failure :: No Match");
		} else {
			double lengthMeters = tempList.get(0).getLengthMeters();
			double wheels = tempList.get(0).getWheels();

			if (tempList.get(0) instanceof Car) {
				parkingCost = lengthMeters * wheels * time;

			}
			if (tempList.get(0) instanceof Van) {
				parkingCost = lengthMeters * wheels * time * 1.5;
			}
			if (tempList.get(0) instanceof Bike) {
				parkingCost = lengthMeters * wheels * time * 0.8;

			}
			removeVehicle(reg);
			System.out.println(
					"Total Cost for repair on: " + tempList + "Cost: " + parkingCost + " Removed From Garage.");
		}

	}

	public double getSpaces() {
		return spaces;
	}

	public void setSpaces(double spaces) {
		this.spaces = spaces;
	}

}
