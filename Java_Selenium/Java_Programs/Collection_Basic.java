import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyClass {

	public static void main(String[] args) {
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(32);
		values.add(9);
		values.remove(5);

	// Fetching value of Collection using Iterator
	Iterator i = values.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	
	// Fetching values of Collection using Enhanced for loop
	for (int j : values) {
		System.out.println(j);
	}
	}
}


