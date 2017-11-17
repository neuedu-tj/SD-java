package designer.factory;

public class IphoneFactory implements Factory {

	@Override
	public Product createProduct() {
		return new Iphone();
	}
	
}
