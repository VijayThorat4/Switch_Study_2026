package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("9420289001");;
		driver.findElement(By.id("pass")).sendKeys("dfsswe");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("u_0_b")).click();
	}
}





