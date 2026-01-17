import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		
		HashMap<Character, Integer> characterCount = findCount(str1);
		
		for (Entry<Character, Integer> entry : characterCount.entrySet()) {
			System.out.println("Character " + entry.getKey() + " has occured " + entry.getValue() + " times");
		}

	}
	
	public static HashMap<Character, Integer> findCount (String str1){
		
		char[] letters = str1.toCharArray();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		for (Character i : letters) {
			if (Character.isLetter(i)){   // To Ignore non-alphabetic characters
				charCountMap.put(i, charCountMap.getOrDefault(i, 0) + 1);
		}
		}
		return charCountMap;
	}
}
