package wrapperclasses;

public class Demo {

	public static void main(String[] args) {
		
		int num = 59;
		
		Integer i = new Integer(num);//wrapping
		
		System.out.println(i.intValue());//unwrapping
		System.out.println(i);

	}

}
