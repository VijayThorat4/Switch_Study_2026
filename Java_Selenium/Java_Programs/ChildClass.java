
public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		ChildClass obj1 = new ChildClass(5);
	}
	
	public ChildClass() {
		super(9);
		System.out.println("Empty from Child Class");
	}

	public ChildClass(int a) {
		super(6);
		System.out.println(a + " from Child Class");
	}
}
