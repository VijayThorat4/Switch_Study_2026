import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap_Check {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement we1 = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement we2 = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("owner", "9420289001-rahul004");
		mp.put("reader", "111111111-doit");
		mp.put("contributor", "999999999-bdfjsd");
		
		we1.sendKeys(mp.get("contributor").split("-")[0]);
		we2.sendKeys(mp.get("contributor").split("-")[1]);
	}	
	
}
