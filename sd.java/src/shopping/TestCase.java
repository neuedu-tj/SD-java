package shopping;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TestCase {

	public static void main(String[] args) {
		
		Customer c = new Customer(1 , "tom");
		
		Address a1 = new Address(1, "tom的隔壁", "13712345678");
		Address a2 = new Address(2, "tom的隔壁的隔壁", "13787654321");
		
		Product p1 = new Product(1 , "Java入门到精通" , new BigDecimal("50.0"));
		Product p2 = new Product(2 , "图解Http" , new BigDecimal("150"));
		Product p3 = new Product(3 , "Echart报表" , new BigDecimal("10"));
		
		///
		
		
		Item i1 = new Item(p2, 2);
		Item i2 = new Item(p3, 1);
		Item i3 = new Item(p3, 1);
		Item i4 = new Item(p3, 1);
		Item i5 = new Item(p3, 1);
		Item i6 = new Item(p3, 1);
		
		BuyCart cart  = new BuyCart();
		cart.addToCart(i1);
		cart.addToCart(i2);
		cart.addToCart(i3);
		cart.addToCart(i4);
		cart.addToCart(i5);
		cart.addToCart(i6);
		
		Orders o = new Orders();
		o.setBuycart(cart);
		o.setCustomer(c);
		o.setAddress(a2);
		o.setOid(12345);
		o.setTime(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(o);
		System.out.println("订单总价 : " + o.getBuycart().getTotalPrice());
		
		

	}

}
