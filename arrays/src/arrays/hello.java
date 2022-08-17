package arrays;

public class hello {

	public static void main(String[] args) {
		
		//declare an array
		int[] arr = new int[10];
		System.out.println(arr.length);
		
		//another way
		int[] arr2 = {1,2,3,4,5};
		
		for(int i=0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
