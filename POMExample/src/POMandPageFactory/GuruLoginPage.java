package POMandPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruLoginPage {
	WebDriver driver;
	By Gusername = By.name("uid");
	By Gpaswd = By.name("password");
	By Glogin = By.name("btnLogin") ;
	
	
	public void login() {
		this.driver = driver;
	}

	public void username(String username) {
		driver.findElement(Gusername).sendKeys(username);
		
	}
	public void password(String password) {
		driver.findElement(Gpaswd).sendKeys(password);
		
	}
	public void login(String login) {
		driver.findElement(Glogin).click();
		
	}
}

