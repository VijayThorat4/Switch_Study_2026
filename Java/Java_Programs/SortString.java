import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "vijaythorat";
		
		List<Character> l1 = new ArrayList<>();
		
		for (Character c : s1.toCharArray()) {
			l1.add(c);
		}
		
		Collections.sort(l1);
		
		StringBuilder S2 = new StringBuilder();
		for (Character c : l1) {
			S2.append(c);
		}
		
		System.out.println(S2);
	}

}
