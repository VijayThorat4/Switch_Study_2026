package Different_URL_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization(String website) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(website);
		driver.manage().window().maximize();
	}
	

}
