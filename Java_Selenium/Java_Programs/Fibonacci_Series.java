package wef;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("Enter iteration of series ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		for(int i=1; i<num; i++) {
			int sum = t1 + t2;
			if (sum>num) {
				break;
			}
			System.out.println(sum);
			t1 = t2;
			t2 = sum;
		}				
	}
}
