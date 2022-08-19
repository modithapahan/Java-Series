package staticvariables;

class Employee {

	String name;
	static String managerName;
	
	public void display() {
		System.out.println("Employee Name : " + this.name);
		System.out.println("Manager Name : " + managerName);
	}
}

