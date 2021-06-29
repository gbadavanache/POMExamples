package POMandPageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import POMandPageFactory.FBLoginPage;
import POMandPageFactory.FBHomePage;


public class FBLoginTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
		    WebDriver driver= new FirefoxDriver(); 
		   driver.get("https://www.facebook.com/");
		   
		   //FBLogin Page 
		   FBLoginPage.FBusername(driver).sendKeys("abc@gmail.com");
		   FBLoginPage.FBpassword(driver).sendKeys("fvnfj");//.sendKeys(Keys.RETURN);
		   FBLoginPage.FBLogin(driver).sendKeys(Keys.RETURN); // .click();
		   
		   //FBHomePage
		   FBHomePage homepage = PageFactory.initElements(driver,FBHomePage.class);
		  homepage.group(driver).click();
		  homepage.scrollDown(driver);
		}
	}

