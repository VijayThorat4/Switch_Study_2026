class MyClass{
	public static void main (String[] args) {
		int[] MyArr = {5,15,86,3652,4};
		int sum = 0;
		for (int i=0; i<MyArr.length; i++) {
			sum = sum + MyArr[i];
		}
		System.out.println(sum);
 	}
}