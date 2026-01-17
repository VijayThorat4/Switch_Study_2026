package Testcase;

import org.testng.annotations.Test;

public class TestBaseClass extends BaseClass{
	
	@Test
	public void goToSite() {
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

}
