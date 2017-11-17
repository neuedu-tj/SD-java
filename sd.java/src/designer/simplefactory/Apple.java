package designer.simplefactory;

public class Apple extends Fruit{
	
	public Apple() {
		System.out.println("一个新 apple");
	}
	
	@Override
	public void grow() {
		System.out.println("苹果在生长🍎");
	}

}
