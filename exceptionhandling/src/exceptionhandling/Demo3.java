package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		
	int marks = 0;
	Scanner userin = new Scanner(System.in);
	
	try {
		System.out.println("Enter your mark : ");
		marks = userin.nextInt();
	} catch(InputMismatchException mis) {
		System.out.println("Error");
	}
	
	System.out.println("Your mark is : " + marks);
}

}