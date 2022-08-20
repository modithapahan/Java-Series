package inheritance;

public class Bike extends Vehicle{

	public void showBikeDetails() {
		vehicleName = "Yamaha";
		color = "black";
		noOfWheels = 2;
		seats = 1;
		
		System.out.println(vehicleName);
		System.out.println(color);
		System.out.println(noOfWheels);
		System.out.println(seats);
	}
}
