class Emp
{
	int EmpID;
	int Salary;
	static String ceo;
	static String JobType;
	
	static    // static block, it executes when you loads a class 
	{
		ceo = "Brother";
	}
	
	public Emp(int EmpID, int Salary)   // Constructor, it executes when you create an object
	{
		this.EmpID = EmpID;
		this.Salary = Salary;
	}
}




public class MyClass1 
{
	public static void main(String[] args) 
	{
		Emp Vijay = new Emp(4, 100);
		Emp Harshal = new Emp(7, 80);
		System.out.println("Vijay " + Vijay.EmpID + Vijay.Salary);
		System.out.println("Harshal " + Harshal.EmpID + Harshal.Salary);
		
		System.out.println(Emp.ceo);     // Accessing variable of static block
		
		Emp.JobType = "White_Coller";	// Accessing static variable with class name
	}
}
