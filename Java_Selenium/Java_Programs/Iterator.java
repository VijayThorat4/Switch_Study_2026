import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer> ();
		a1.add(10);
		a1.add(15);
		a1.add(7);
		a1.add(85);
		a1.add(13);
		
		Iterator<Integer> i = a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());    // next() is used to print the value
		}
	}
}
