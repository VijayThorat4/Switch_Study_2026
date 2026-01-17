package Different_URL_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScenario extends Base{
	
	@Test
	@Parameters("url1")
	public void m1(String website) {
		System.out.println(website + " is launching");
		initialization(website);
	}

	@Test
	public void m2() {
		System.out.println("Method m1 is running");
		driver.quit();
	}
	
	@Test
	@Parameters("url2")
	public void m3(String website) {
		System.out.println(website + " is launching");
		initialization(website);
	}
	
	@Test
	public void m4() {
		System.out.println("Method m3 is running");
		driver.quit();
	}
	
}
