
public class MyClass3 {

	public static void main(String[] args) 
	{
		String name = "Selenium Webdriver";
		boolean status = name.startsWith("Selenium");
		System.out.println("Status is "+status);
		
		boolean status2 = name.endsWith("driver");
		System.out.println("New status is " +status2);
		
		String s1 = "Welcome to world";
		String s2 = "Welcome To world";
		boolean status3 = s1.equals(s2);
		System.out.println("Equal status is "+status3);
		
		boolean status4 = s1.equalsIgnoreCase(s2);
		System.out.println("Equal status is "+status4);
		
		boolean status5 = s1.contains("world");
		System.out.println("Contains status is "+status5);
		
		String fullname = "Selenium-HP-QTP-Grid";
		String []toolname = fullname.split("-");
		for(int i=0; i<toolname.length; i++)
		{
			System.out.println(toolname[i]);
		}
		
		String name2 = "      Vj Rocks     ";
		System.out.println(name2.trim());
		
		System.out.println(name.charAt(0));
	}
}
