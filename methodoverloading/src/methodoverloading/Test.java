package methodoverloading;

public class Test {
	
	int no;

	public void show() {
		System.out.println("Show 1");
	}
	
	public void show(int number) {
		no = number;
		System.out.println("Show 2");
	}
}
