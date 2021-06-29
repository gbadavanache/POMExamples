package POMandPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginPage {
	static WebDriver driver ;
	
	public void loginPage() {
		this.driver = driver;
	}
	
	public static WebElement FBusername(WebDriver driver) {
		WebElement UN = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		return UN;
	}
	
	public static WebElement FBpassword(WebDriver driver) {
	WebElement Pass = driver.findElement(By.cssSelector("input[name=\"pass\"]"));
	return Pass;
	}
	public static WebElement FBLogin(WebDriver driver) {
		WebElement FBlogin = driver.findElement(By.name("login"));
				return FBlogin;
	}
}

