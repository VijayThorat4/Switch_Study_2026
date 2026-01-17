import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MyClass{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		// Mouse hover and click after menu drop
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		Thread.sleep(3000);
		
		// Drag drop
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		Thread.sleep(3000);
		
		//  Right Click
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickElement = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightClickElement).build().perform();		
		
	}
}