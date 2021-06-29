package POMandPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBHomePage {
	
	WebDriver driver;
	public static WebElement group(WebDriver driver) {
		WebElement group = driver.findElement(By.linkText("Groups"));
		return group;
	}
	public static WebElement scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollDown = (WebElement) js.executeScript("window.scrollBy(0,1000)");
		return scrollDown;
	}
	

}
