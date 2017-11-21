package collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestCase {
	
	@Test
	public void testSet() {
		
		Set<Integer> sets = new HashSet<Integer>();

		sets.add(3);
		sets.add(2);
		sets.add(5);
		sets.add(4);	
		sets.add(10);
	
	
		System.out.println(sets);  //无序输出
		
		for (Iterator<Integer> it = sets.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
	
	
	
	@Test
	public void testSet2() {
		
		Set<String> sets = new TreeSet<String>();
	
		sets.add("BA");
		sets.add("BC");
		sets.add("AA");
		sets.add("AC");	
		sets.add("AB");
	
		System.out.println(sets);  //无序输出
		
		for (Iterator<String> it = sets.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
	
	
	
	@Test
	public void testStusByScore() {
		
		Set<Stu> stus = new TreeSet<Stu>(); // TreeSet 是发掘 具备排序潜质的类
		
		Stu stu1 = new Stu(1 , "a" , 90);
		Stu stu2 = new Stu(2 , "b" , 80);
		Stu stu3 = new Stu(3 , "c" , 95);
		Stu stu4 = new Stu(4 , "d" , 85);
		Stu stu5 = new Stu(5 , "e" , 99);
		Stu stu6 = new Stu(6 , "f" , 60);
		
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		stus.add(stu6);
		
		for (Iterator iterator = stus.iterator(); iterator.hasNext();) {
			Stu stu = (Stu) iterator.next();
			System.out.println(stu);
		}
	
		
	}
	
	
	
	@Test  //尝试用 List  进行排序
	public void testStusByScore2() {
		
		List<Stu> stus = new ArrayList<Stu>(); 
		
		Stu stu1 = new Stu(1 , "a" , 90);
		Stu stu2 = new Stu(2 , "b" , 80);
		Stu stu3 = new Stu(3 , "c" , 95);
		Stu stu4 = new Stu(4 , "d" , 85);
		Stu stu5 = new Stu(5 , "e" , 99);
		Stu stu6 = new Stu(6 , "f" , 60);
		
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		stus.add(stu6);
		
		Collections.sort(stus);
		
		for (Stu stu : stus) {
			System.out.println(stu);
		}

		
	}
	

}
