import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class MyClass{
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Scroll to specific location pixel
		jse.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(2000);
		

		// Scroll to specific element
		WebElement dis = driver.findElement(By.xpath("//span[contains(text(), 'Up to 50% off home essentials | Amazon Brands & more')]"));
		jse.executeScript("arguments[0].scrollIntoView(true)", dis);
		Thread.sleep(2000);
		
		
		//  Scroll till bottom of page
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		
		//  Finding scroll bar moving and it horizontally from left to right
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		driver.manage().window().maximize();
		WebElement slideBar = driver.findElement(By.xpath("//input[@type='range']"));
		slideBar.sendKeys(Keys.END);
		Thread.sleep(2000);
		
		
		//  Scroll dynamically for loading page
		driver.get("http://the-internet.herokuapp.com/infinite_scroll");
		driver.manage().window().maximize();
		
		long initialHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
		while (true) {
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
			if (initialHeight == currentHeight) {
				break;
			}
			initialHeight = currentHeight;
		}
		
		
		
	}
}