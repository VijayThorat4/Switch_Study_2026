import java.util.Scanner;

class MyClass{
	public static void main(String[] args) {
		System.out.print("Please enter your email - ");
		Scanner st = new Scanner (System.in);
		String str = st.nextLine();
		int len = str.length();
		char[] li = new char[len];
		li = str.toCharArray();
		System.out.print("Your mail domain is - ");
		for (int i=0; i<len; i++) {
			if (li[i]=='@') {
				for (int j=i+1; j<len; j++) {
					if (li[j]=='.') {
						break;
					}
				System.out.print(li[j]);
				}
			}
		}
	}
}