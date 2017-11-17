package shopping;

import java.util.LinkedList;
import java.util.List;

public class BuyCart {

	private List<Item> items = new LinkedList<Item>();

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addToCart(Item item) {
		
		if(items.contains(item)) {
//			System.out.println("购物车有此项, 不再添加" );
			
			for (Item i : items) {
				if(i.equals(item)) {
					i.setAmount( i.getAmount() + 1);
				}
			}
			
		} else {
			items.add(item);
		}
		
		
	}

	public double getTotalPrice() {

		double total = 0.0;
		
		for (Item item : items) {
			total += item.getProduct().getPrice().doubleValue() * item.getAmount();
		}
		

		return total;
	}

	@Override
	public String toString() {
		return ""+items;
	}
	
	

}
