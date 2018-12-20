package com.qa.BuilderGarage;

public class App 
{
    public static void main( String[] args )
    {
        Vehicle car = new Vehicle.VehicleBuilder()
        		.withName("BigCar")
        		.withAge(17)
        		.withNoOfWheels(4)
        		.withBill(0)
        		.build();
        
        Vehicle plane = new Vehicle.VehicleBuilder()
        		.withTypeOfVehicle("Plane")
        		.withAge(4)
        		.withNoOfWheels(2)
        		.withNoOfWings(2)
        		.withCanFly(true)
        		.withBill(0)
        		.build();
        
        Vehicle motorbike = new Vehicle.VehicleBuilder()
        		.withTypeOfVehicle("motorbike")
        		.withNoOfSeats(2)
        		.withNoOfWheels(2)
        		.withBill(0)
        		.build();
        
        Garage garage = new Garage();
        
        garage.addToGarage(car);
        garage.addToGarage(plane);
        garage.addToGarage(motorbike);
        garage.billVehicles();
        
        
    }
}
