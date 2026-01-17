
public class MyClass 
{
	public static void main(String[] args) {
		Abc.show();
		Abc.i = 5;
	}

}

class Abc
{
	static int i;
	public static void show()
	{
		System.out.println("Hi");
	}
}
