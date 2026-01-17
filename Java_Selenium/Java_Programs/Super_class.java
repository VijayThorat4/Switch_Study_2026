class A
{
	public A ()
	{
		System.out.println("in A class Non Parameterized constructor ");
	}
	public A (int i)
	{
		System.out.println("In A class Parameterized constructor ");
	}
}

class B extends A
{
	public B ()
	{
		System.out.println("in B class Non parameterized" );
	}
	public B (int i)
	{
		super(i);
		System.out.println("in B class parameterized constructor ");
	}
}

public class MyClass1 {
	public static void main(String[] args) 
	{
		B obj1 = new B(4);
	}
}
