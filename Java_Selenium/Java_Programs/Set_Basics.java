import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<Integer>();
//		Set<Integer> values = new TreeSet<Integer>();
		values.add(5);
		values.add(56);
		values.add(31);
		values.add(5);
		
		for (int i: values) {
			System.out.println(i);
		}

	}

}
