package interfaces;

public class Demo {

	public static void main(String[] args) {
		
		Cow c1 = new Cow();
		c1.eat();
		c1.speak();
		
		System.out.println("");
		
		Dog d1 = new Dog();
		d1.eat();
		d1.speak();
		
		Animal[] animals = {
			new Dog(),
			new Cow(),			
		};
		
		for (int i =0; i<animals.length; i++) {
			animals[i].speak();
		}

	}

}
