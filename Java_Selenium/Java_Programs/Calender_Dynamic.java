import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[contains(text(),\"Onward Date\")]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='rb-calendar']/table//td"));
		
		for (int i=0; i<(li.size()); i++) {
			String date = li.get(i).getText();
			String tar = "13";
			if (date == tar) {
				li.get(i).click();
				System.out.print("Done");
			}
		}
	}
}
