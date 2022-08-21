package interfaces;

public class Cow implements Animal{

	@Override
	public void speak() {
		System.out.println("Cow Cow");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat some grass");
		
	}

}
