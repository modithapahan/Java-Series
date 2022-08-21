package getinputs;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner takeScanner = new Scanner(System.in);
		
		String name;
		int age;
		double mark;
		float salary;

		System.out.println("Enter your name: ");
		name = takeScanner.next();
		
		System.out.println("Enter your age: ");
		age = takeScanner.nextInt();
		
		System.out.println("Enter your mark: ");
		mark = takeScanner.nextDouble();
		
		System.out.println("Enter your salary: ");
		salary = takeScanner.nextFloat();
		
		System.out.println("");
		
		System.out.println("Loaded...");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Mark: " + mark);
		System.out.println("Salary: " + salary);
	}

}
