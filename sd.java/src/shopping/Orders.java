package shopping;

import java.sql.Timestamp;

public class Orders {
	
	private int oid;
	private Timestamp time;
	
	private BuyCart buycart;
	private Customer customer;
	private Address address;
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", time=" + time + "\n, \t buycart=" + buycart + "\n, customer=" + customer
				+ "\n, address=" + address + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public BuyCart getBuycart() {
		return buycart;
	}
	public void setBuycart(BuyCart buycart) {
		this.buycart = buycart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Orders() {
		
	}
	
	public Orders(int oid, Timestamp time, BuyCart buycart, Customer customer, Address address) {
		super();
		this.oid = oid;
		this.time = time;
		this.buycart = buycart;
		this.customer = customer;
		this.address = address;
	}

	
	
}
