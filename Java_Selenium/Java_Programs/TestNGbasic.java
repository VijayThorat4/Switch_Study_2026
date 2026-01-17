package MyPac;

import org.testng.annotations.Test;

public class MyClass {
	
	@Test(priority=1,description="About to start journey")
	public void LoginPage() {
		System.out.print("Hi Bro, you have logged in ");
	}

	@Test(priority=2,description="do your work")
	public void HomePage() {
		System.out.println("You are on main page now ");
	}
	
	@Test(priority=3,description="enough")
	public void LogOut() {
		System.out.println("You have done your work ");
	}
	
}
