package designer.simplefactory;

public class FruitFactory {
	
	public static Fruit getFruit(String name) {
		
		if("apple".equalsIgnoreCase(name)) {
			
			System.out.println("苹果装箱");
			
			return new Apple();
			
		} else if( "banana".equalsIgnoreCase(name)) {
			
			return new Banana();
		} else {
			return null;
		}
		
	}

}
