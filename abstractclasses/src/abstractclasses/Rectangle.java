package abstractclasses;

public class Rectangle extends Shape{
	int x = 12;
	int y = 12;
	
	@Override
	public int getArea() {
		return x*y;
	}
}
