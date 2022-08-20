package inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Bike b1 = new Bike();
		Van v1 = new Van();
		
		c1.showCarDetails();
		System.out.println("");
		b1.showBikeDetails();
		System.out.println("");
		v1.showVanDetails();

		System.out.println("");
		
		c1.start();
		b1.acclerate();
		v1.vehicleBreak();
	}

}
