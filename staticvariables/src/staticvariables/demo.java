package staticvariables;

public class demo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Employee.managerName = "Mr.Nisal";
		
		e1.name = "Moditha";	
		e2.name = "Modi";			
		
		e1.display();
		System.out.println();
		e2.display();

	}

}
