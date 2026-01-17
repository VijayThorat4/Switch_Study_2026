import java.util.Scanner;

class MyClass{
	public static void main(String[] args) {
		System.out.println("Enter size of an array ");
		Scanner st = new Scanner (System.in);
		int size = st.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter values in an array ");
		for (int i=0; i<size; i++) {
			arr[i] = st.nextInt();
		}
	}
}