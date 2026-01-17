import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number ");
		int num = sc.nextInt();
		
		if (isPalingdrome(num)) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not a Palindrome");
		}
	}
	
	public static boolean isPalingdrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;
		
		while (num >0) {
			int reminder = num % 10;
			reversedNumber = 10 * reversedNumber + reminder;
			num = num / 10;
		}
		
		return originalNumber == reversedNumber;
	}

}
