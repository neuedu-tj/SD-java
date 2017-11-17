package shopping;

public class Item {

	private Product product;
	private int amount;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Item() {
		
	}
	
	
	public Item(Product product, int amount) {
		super();
		this.product = product;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", amount=" + amount + "] + \n";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Item item1 = this;
		Item item2 = (Item)obj;
		
		if(item1.getProduct().getPid() == item2.getProduct().getPid() ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
