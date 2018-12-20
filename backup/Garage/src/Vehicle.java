
public abstract class Vehicle {

	private double manufactureYear;
	private Double engineSixe;
	private double wheels;
	private String registration;
	private String make;
	private double lengthMeters;

	public Vehicle(double manufactureYear, Double engineSixe, double wheels, String registration, String make,
			double lengthMeters) {
		this.manufactureYear = manufactureYear;
		this.engineSixe = engineSixe;
		this.wheels = wheels;
		this.registration = registration;
		this.make = make;
		this.lengthMeters = lengthMeters;
	}

	public Vehicle(String registration, double lengthMeters, double wheels) {
		this.registration = registration;
		this.lengthMeters = lengthMeters;
		this.wheels = wheels;
	}

	public abstract void drive();

	// move forward
	public abstract void reverse();

	// move in reverse
	public double getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(double manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public Double getEngineSixe() {
		return engineSixe;
	}

	public void setEngineSixe(Double engineSixe) {
		this.engineSixe = engineSixe;
	}

	public double getWheels() {
		return wheels;
	}

	public void setWheels(double wheels) {
		this.wheels = wheels;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getLengthMeters() {
		return lengthMeters;
	}

	public void setLengthMeters(double lengthMeters) {
		this.lengthMeters = lengthMeters;
	}

	@Override
	public String toString() {
		return "Vehicle [manufactureYear=" + manufactureYear + ", engineSixe=" + engineSixe + ", wheels=" + wheels
				+ ", registration=" + registration + ", make=" + make + ", lengthMeters=" + lengthMeters + "]";
	}

}
