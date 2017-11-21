package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Before;
import org.junit.Test;

public class TestCase {
	
	
	List<Integer> lists = new ArrayList<Integer>();
	
	public TestCase() {
		
	}
	
	
	@Before
	public void init() {
		lists.add(5);
		lists.add(2);
		lists.add(7);
		lists.add(1);
		lists.add(3);
		lists.add(8);
	}

	
	@Test
	public void testSimpleIterator () {
		
		Iterator<Integer> it = lists.iterator();
		
		while(it.hasNext()) {
	
			Integer item = it.next();
			if(item.equals(2)) {
				it.remove();
				continue;
			}

			System.out.print(item+"\t");
		}
		
		
	}
	
	
	@Test
	public void testListIterator () {
		
		ListIterator<Integer> it = lists.listIterator();
		
		while(it.hasNext()) {
			
			Integer item = it.next();
			int index = it.nextIndex();
			

			System.out.println(index + " : " + item);
		}
		
		
		System.out.println("------");
		
		while(it.hasPrevious()) {
			int index = it.previousIndex();
			Integer item = it.previous();

	

			System.out.println(index + " : " + item);
		}
		
		
		
		
		
	}
	
	
}
