/*In which collection classes null is not allowed? Duplicate null is not allowed? Multiple nulls are allowed?*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Q4Main {

	public static void main(String[] args) {
		
		//Collection<String> c = new ArrayList<>();// allows Null
		
		Collection<String> c = new HashSet<>();// allows Null
		
		//Collection<String> c = new LinkedHashSet<>();// allows Null value
		//Collection<String> c = new TreeSet<>();//allows Null valiue
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("E");
		c.add("A");
		c.add("Null");
		c.add("Null");
		
		Iterator<String> itr1 = c.iterator();
		while(itr1.hasNext()) {
			String ele = itr1.next(); // throws ConcurrentModificationException after adding "X".
			System.out.println(ele);
		
		
		
	}

}
}
