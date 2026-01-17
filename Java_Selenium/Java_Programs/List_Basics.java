import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyClass2 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(8);
		values.add(32);
		values.add(1,6);    //  Inserts element at second position
		
		Collections.sort(values);
		
		values.forEach(System.out::println);   // Stream API...Lambda Expression
	}
}




