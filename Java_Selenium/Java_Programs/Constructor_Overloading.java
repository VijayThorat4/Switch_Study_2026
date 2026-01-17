
public class MyClass {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		Abc obj2 = new Abc(5);
		Abc obj3 = new Abc(5.5);
	}
}

class Abc{
	Abc(){
		System.out.println("In default Constructor");
	}
	
	Abc(int i){
		System.out.println("In integer Constructor");
	}
	
	Abc(double i){
		System.out.println("In double Constructor");
	}
}
