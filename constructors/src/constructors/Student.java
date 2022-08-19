package constructors;

public class Student {
	String stdName;
	int stdID;
	int noOfSubjects;
	String email;
	
	public Student() {
		this.stdName= "Modi";
		this.stdID = 21;
		this.noOfSubjects = 2;
		this.email = "modithapahan@gmail.com";
	}
	
	public void display() {
		System.out.println("Student Name : " + this.stdName);
		System.out.println("Student ID : " + this.stdID);
		System.out.println("No of subjects : " + this.noOfSubjects);
		System.out.println("Email : " + this.email);
	}
}
