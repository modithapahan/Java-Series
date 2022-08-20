package inheritance;

public class Car extends Vehicle{
	int noOfDoors;
	
	public void showCarDetails() {
		vehicleName = "Nissan";
		color = "Red";
		noOfWheels = 4;
		seats = 4;
		noOfDoors = 4;
		
		System.out.println(vehicleName);
		System.out.println(color);
		System.out.println(noOfWheels);
		System.out.println(seats);
		System.out.println(noOfDoors);
	}
}
