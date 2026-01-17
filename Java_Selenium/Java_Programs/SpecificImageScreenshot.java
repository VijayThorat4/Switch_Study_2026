package Testing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class loginPage {
	
	@Test
	public void HomePage() throws IOException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iplt20.com/");
		driver.manage().window().maximize();	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		BufferedImage fullPage = ImageIO.read(source);
		
		WebElement image = driver.findElement(By.xpath("//i[@class=\"team-logo tLogo132x u-show-desktop u-hide-phablet CSK\"]"));       // Find the image element
		
		Point point = image.getLocation();   // get location of image on page
		int imageWidth = image.getSize().getWidth();   // get width of image
		int imageHeight = image.getSize().getHeight(); // get height of image
		
		// Crop the entire page screenshot to get only element screenshot
		BufferedImage imageScreenshot = fullPage.getSubimage(point.getX(), point.getY(), imageWidth, imageHeight);
		ImageIO.write(imageScreenshot, "jpg", source);
		FileHandler.copy(source, new File("C:\\Users\\VJ\\Desktop\\Sept19\\Mav1\\src\\logo2.jpg"));
	}
}
