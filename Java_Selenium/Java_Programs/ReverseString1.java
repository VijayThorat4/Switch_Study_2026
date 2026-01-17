import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		
		System.out.println("Reversed String is : " + reverseString(str1));
	}
	
	public static String reverseString(String str1)
	{
		StringBuffer sb1 = new StringBuffer(str1);
		return sb1.reverse().toString();
		}
}
