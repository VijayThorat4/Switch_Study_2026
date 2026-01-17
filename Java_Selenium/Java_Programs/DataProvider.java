import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyClass {

	@Test(dataProvider="worldpress")
	public void MyTest(String user) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in");
		WebElement ele = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
		ele.sendKeys(user);
		Thread.sleep(5000);
		driver.quit();
	}
	
	@DataProvider(name = "worldpress")
	public Object[] UserInput() {
		
		Object[] data = new Object[3];
		data[0]="VJ_User_One";
		data[1]="DS_User_two";
		data[2]="Ran_Three";
		return data;
	}
	
	
	
	
	
	
}
