import java.util.Scanner;

public class MyClass3 {
	
	public static int fact(int num) {
		if (num==1) {
			return num;
		} else {
			return num * fact(num-1);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one integer : ");
		int i = sc.nextInt();
		System.out.println("Factorial of the number is " + fact(i));
	}
}
