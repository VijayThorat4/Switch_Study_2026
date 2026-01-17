
public class MyClass2 {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.setX(7);
	}
}

class Abc{
	private int x;
	public void setX(int x) {
		this.x = x;
		System.out.println(x);
	}
}