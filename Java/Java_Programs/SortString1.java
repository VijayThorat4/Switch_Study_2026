import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		
		System.out.println("Sorted String is " + stringSort(str1));
	}
	
	public static String stringSort(String str1) {
		String stringWithoutDigit = str1.replaceAll("[^a-zA-Z]", "");
		
		char[] charArray = stringWithoutDigit.toCharArray();
		Arrays.sort(charArray);
		
		// Reversing this sorted array
		for (int x=0; x<charArray.length/2; x++) {
			char temp = charArray[x];
			charArray[x] = charArray[charArray.length-1-x];
			charArray[charArray.length-1-x] = temp;
		}
	return new String(charArray);
	}
}
