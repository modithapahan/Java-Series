package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		
		int d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int no1,no2;
			
			System.out.println("Enter no1 : ");
			no1 = sc.nextInt();
			
			System.out.println("Enter no1 : ");
			no2 = sc.nextInt();
			
			d = no1/no2;
		}catch(ArithmeticException ex1) {
			System.out.println("You cannot devide number by zero");
		} catch(InputMismatchException ex2) {
			System.out.println("You cannot enter a string value");
		}

		System.out.println(d);
		System.out.println("End of the program!");
	}

}
