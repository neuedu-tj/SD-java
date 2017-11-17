package designer.factory;

public class IpadFactory implements Factory {
	
	@Override
	public Product createProduct() {
		
		return new Ipad();
	}

}
