package ListenerConcept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	public void failed(String methodName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File snap = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap, new File ("C:\\Users\\VJ\\ITestNGListener\\Mav1\\Screenshot\\" + methodName + "_failed.jpg"));
	}
	
	

}
