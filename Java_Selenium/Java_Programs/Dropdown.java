import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByIndex(3);    // It will selct March as 0th index was Month title
		Thread.sleep(3000);
		month_dd.selectByValue("10");   // value is an attribute. It will select Octo
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");   // This is most recommented 
		
		
		WebElement selected_value = month_dd.getFirstSelectedOption(); // get webelement of current selected option
		System.out.println("After selecting selected value is "+selected_value.getText());
		
		List<WebElement>month_list = month_dd.getOptions();
		int total_month = month_list.size();
		System.out.println("Total month count is "+total_month);   // prints total number of dropdown option
		
		for (WebElement ele:month_list)
		{
			System.out.println(ele.getText());
		}
	}
}
