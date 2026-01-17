
public class MyClass {
	public static void main(String args[]) {
	Vehicle obj1 = new Vehicle();
	
	obj1.setName("BMW");
	System.out.println("Name of car is " + obj1.getName());
	
	obj1.setCc(8500);
	System.out.println("Engine of car is " + obj1.getCc());
	}
}

class Vehicle{
	private String name; 
	private int cc;
	
	public void setName (String i) {
		name = i;
	}
	public String getName() {
		return name;
	}
	
	public void setCc (int j) {
		cc = j;
	}
	public int getCc () {
		return cc;
	}
}
