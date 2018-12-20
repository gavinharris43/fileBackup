package com.qa.BulderPattern;

class VehicleBuilderImpl implements VehicleBuilder {
	private Vehicle vehicleTmp;

	public VehicleBuilderImpl() {
		vehicleTmp = new Vehicle();
	}

	public Vehicle build() {
		Vehicle car = new Vehicle();
		car.setRegistration(vehicleTmp.getRegistration());
		car.setWheels(vehicleTmp.getWheels());
		car.setLengthMeaters(vehicleTmp.getLengthMeaters());
		car.setType(vehicleTmp.getType());
		return car;
	}
	

	public VehicleBuilder setRegistration(final String registration) {
		vehicleTmp.setRegistration(registration);
		return this;
	}

	public VehicleBuilder setWheels(final int wheels) {
		vehicleTmp.setWheels(wheels);
		return this;
	}

	public VehicleBuilder setLenghtMeaters(final int length) {
		vehicleTmp.setLengthMeaters(length);
		return this;
	}

	public VehicleBuilder setType(final String type) {
		vehicleTmp.setType(type);
		return this;
	}

}