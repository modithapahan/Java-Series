package inheritance;

public class Van extends Vehicle{

	int noOfDoors;
	int loadCapacity;
	
	public void loadVan() {
		System.out.println("Van Loading...");
	}
	
	public void showVanDetails() {
		vehicleName = "Toyota Van";
		color = "Red";
		noOfWheels = 4;
		seats = 10;
		noOfDoors = 4;
		loadCapacity = 2000;
		
		System.out.println(vehicleName);
		System.out.println(color);
		System.out.println(noOfWheels);
		System.out.println(seats);
		System.out.println(noOfDoors);
		System.out.println(loadCapacity);
	}
	
	
}
