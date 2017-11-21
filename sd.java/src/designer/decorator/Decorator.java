package designer.decorator;

public class Decorator {
	
	private Swift swift; //期待能实现 swift 的真生 (孙悟空) 
	
	public Decorator(Swift swift) {
		this.swift = swift;
	}
	
	public void fly() {
		swift.fly();
	}

}
