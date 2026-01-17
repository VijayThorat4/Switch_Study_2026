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
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Vijay");
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title is "+driver.getTitle());
		
	}
}