package designer.factory;

public class Client {
	
	
	public static void main(String[] args) {
		
		Factory p = new IphoneFactory();
		
		Iphone i = (Iphone)p.createProduct();
		
		
	}

}
