package designer.simplefactory;

public class Client {
	
	public static void main(String[] args) {
		
		Apple apple = (Apple)FruitFactory.getFruit("apple");
		
		
	}

}
