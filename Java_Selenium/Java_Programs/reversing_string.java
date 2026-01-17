package wef;

import java.util.Scanner;

public class dty {
	public static void main(String[] args) {
		System.out.println("Enter mail ");
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		int len = str.length();
		char[] li = new char[len];
		li = str.toCharArray();
		for (int i=len-1; i>-1 ;i--) {
			System.out.print(li[i]);
		}
	}
}
