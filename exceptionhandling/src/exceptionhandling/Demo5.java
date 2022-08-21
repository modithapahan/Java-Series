package exceptionhandling;

public class Demo5 {

	public static void main(String[] args) {
		
		try{
			System.out.println("This is the main try catch bloak");
			
			try {
				System.out.println("1 st try catch block");
				int a = 12;
				int b = 0;
				int c = a/b;
			}catch(ArithmeticException ex) {
				System.out.println("You cannot devide a number by zero");
			}
			
			try {
				System.out.println("2 nd try catch block");
				int number[] = new int[3];
				number[5] = 10;
			}catch(ArrayIndexOutOfBoundsException ex2) {
				System.out.println("Array out of bound");
			}
			
		}catch(ArithmeticException ex3) {
			System.out.println("Exception occur");
		} catch(ArrayIndexOutOfBoundsException ex4) {
			System.out.println("Array exception occur");
		}

		System.out.println("End of the program");
	}

}
