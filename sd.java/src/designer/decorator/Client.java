package designer.decorator;

public class Client {
	
	public static void main(String[] args) {
		
		Swift mk = new MonkeyKing();
		mk.fly();
		
		Fish fish = new Fish(mk);
		fish.fly();
		
	}

}
