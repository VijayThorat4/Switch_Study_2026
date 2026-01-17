package ListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base{
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void LoginTest() {
		Assert.assertEquals(true, false);
	}
	
	
	@Test
	public void DataCreate() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void DataValidate() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Logout() {
		Assert.assertEquals(true, true);
	}

}
