
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage(10);
		Car vehicle = new Car("PJ59 ZMZ", 2, 4);
		Van vehicle1 = new Van("PJ59 ZMH", 4, 4);

		System.out.println(garage.addVehicle(vehicle));
		//System.out.prdoubleln(garage.addVehicle(vehicle1));
		
		garage.cost(6);
		garage.removeVehicle("PJ59 ZM");
		garage.cost(2.5, "PJ59 ZMZ");
		System.out.println(garage.addVehicle(vehicle1));
		garage.cost(2.5, "PJ59 ZMH");
		System.out.println(garage.removeAll());
	}

}
