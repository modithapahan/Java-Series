package staticmethods;

public class Employee {

	String name;
	String managerName;
	static int workHrs;
	
	public static void showWorkHrs() {
		System.out.println("Hours are : " + workHrs);
	}
}
