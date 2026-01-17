import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "vijaythorat";
		
		StringBuilder reversedString = new StringBuilder();
		
		for (int i = s1.length()-1; i>=0; i--) {
			reversedString.append(s1.charAt(i));
		}

		System.out.println(reversedString);
	}

}
