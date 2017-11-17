package designer.singleton;

public class Recycle {
	
	private static Recycle recycle = new Recycle();
	
	private Recycle() {
		
	}
	
	public static Recycle getInstance() {
		return recycle;
	}

}
