
public class Car extends Vehicle {

	private double doors;
	private double rearSeats;

	public Car(double manufactureYear, Double engineSixe, double wheels, String registration, String make, double lengthMeters,
			double doors, double rearSeats) {
		super(manufactureYear, engineSixe, wheels, registration, make, lengthMeters);
		this.doors = doors;
		this.rearSeats = rearSeats;
	}

	public Car(String registration, double lengthMeters, double wheels) {
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

	public double getDoors() {
		return doors;
	}

	public void setDoors(final double doors) {
		this.doors = doors;
	}

	public double getRearSeats() {
		return rearSeats;
	}

	public void setRearSeats(final double rearSeats) {
		this.rearSeats = rearSeats;
	}

	@Override
	public String toString() {
		return "Car [Registration= " + getRegistration() + ", Wheels= " + getWheels() + ", LengthMeters= "
				+ getLengthMeters() + "]";
	}

}
