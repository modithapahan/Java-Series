package abstractclasses;

public class Circle extends Shape{
	
	int radius = 14;

	@Override
	public int getArea() {
		return (int) (3.14 * radius * radius);
	}
	
}
