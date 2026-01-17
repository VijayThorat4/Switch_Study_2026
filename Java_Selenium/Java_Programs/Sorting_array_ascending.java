import java.util.Scanner;

class MyClass{
	public static void main(String[] args) {
		System.out.println("Enter size of an array ");
		Scanner st = new Scanner (System.in);
		int size = st.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter values in an array ");
		
		for (int i=0; i<size; i++) {      // Creating array by accepting user input
			arr[i] = st.nextInt();
		}
		
		for (int i=0; i<size; i++) {      // Sorting the array
			for (int j=i; j<size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i:arr) {                // Enhanced for loop
			System.out.println(i);
		}
	}
}