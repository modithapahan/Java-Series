package exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 0;
		int c = 0;
		
		try {
			c = a/b;
		}catch(ArithmeticException ex) {
			System.out.println("You cannot solve this.");
		}
		
		System.out.println(c);

	}

}
