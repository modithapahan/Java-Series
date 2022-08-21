package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		int noOfSubjects = 0;
		int total = 0;
		double avg = 0;
		double mark[] = new double[3];
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("**Your Marks Center**");
		
		try {
		System.out.println("Enter no of subjects: ");
		noOfSubjects = take.nextInt();
		
		for(int i=0; i<mark.length; i++) {
			System.out.println("Enter your mark for subject " + (i+1) + " :");
			mark[i] = take.nextDouble();
			
			total+= mark[i];
		}
		} catch(InputMismatchException ex2) {
			System.out.println("Cannot enter a String value");
		}
		
		try {
			avg = total/noOfSubjects;
		} catch(ArithmeticException ex) {
			System.out.println("Marks devided by zero");
		}
		
		System.out.println("Average mark is : " + avg);
		
	}
}