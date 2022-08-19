package package2;

import package1.Person;

public class Student extends Person{
	
	public void showPersonDetails() {
		name = "Modi";
		System.out.println("Student Name is : " + this.name);
	}
}
