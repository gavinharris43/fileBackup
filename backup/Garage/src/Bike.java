
public class Bike extends Vehicle {

	public Bike(double manufactureYear, Double engineSixe, double wheels, String registration, String make,
			double lengthMeters) {
		super(manufactureYear, engineSixe, wheels, registration, make, lengthMeters);
		// TODO Auto-generated constructor stub
	}

	public Bike(String registration, double lengthMeters, double wheels) {
		super(registration, lengthMeters, wheels);

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Bike [Registration= " + getRegistration() + ", Wheels= " + getWheels() + ", LengthMeters= "
				+ getLengthMeters() + "]";
	}

}
