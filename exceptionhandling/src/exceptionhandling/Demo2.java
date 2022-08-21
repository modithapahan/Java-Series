package exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		
		try {
			array[0] = 5;
			array[2] = 6;
			array[7] = 8;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array is bigger than implimented size");
		}
		System.out.println("End of the program");
	}

}
