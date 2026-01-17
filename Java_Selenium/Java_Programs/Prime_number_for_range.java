import java.util.Scanner;

class MyClass3{
	public static void main (String[] args) {
		Scanner st = new Scanner (System.in);
		int num = st.nextInt();
		for (int i=2; i<num+1; i++) {
			boolean flag = true;
			for (int j=2; j<i; j++) {
				if (i%j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i);
			}
		}
	}
}