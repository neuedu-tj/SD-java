package collection.list.array;

import java.util.ArrayList;

public class TestCase {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("tom");
		array.add("jack");
		array.add("boss");
		
		System.out.println(array.contains("tom")); //  contains 方法会采用  equals 来判断
		

	}

}
