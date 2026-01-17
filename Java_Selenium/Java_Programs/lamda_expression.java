interface A
{
	public void show();
}

public class MyClass2 {
	public static void main (String[] args)
	{
//		A obj1 = new A()
//		{
//			public void show()
//			{
//				System.out.println("Hello ");
//			}
//		};
//		obj1.show();
		
		A obj1 = () -> System.out.println("Hello ");
		obj1.show();
	}
}


