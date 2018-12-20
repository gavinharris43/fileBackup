

interface VehicleBuilder {
	Vehicle build();

	VehicleBuilder setRegistration(final String registration);

	VehicleBuilder setWheels(final int wheels);
    
	VehicleBuilder setLenghtMeaters(final int length);
    
   
}
