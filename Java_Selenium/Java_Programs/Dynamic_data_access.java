import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class MyClass{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		
		String rowdata = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]")).getText();
		System.out.println(rowdata);
		
		String dynadata = driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(dynadata);
	}
}