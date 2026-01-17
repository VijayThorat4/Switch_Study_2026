import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MyClass{
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window handle is " + parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'www.google.com')]")).click();
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(@href,'yahoo')]")).click();
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		tabs.get(0);           // will return the handle of parent tab
		tabs.get(1);           // will return the handle of second tab
		
		driver.switchTo().window(tabs.get(0));      // will switch to parent tab    
		driver.close();
		
	}
}