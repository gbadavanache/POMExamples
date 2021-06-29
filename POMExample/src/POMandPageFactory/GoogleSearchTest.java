package POMandPageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import POMandPageFactory.GoogleSearch;

public class GoogleSearchTest {
	 WebDriver driver = null ;
		
	 public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
    WebDriver driver= new FirefoxDriver(); 
    driver.get("https://www.google.com/");
    
    GoogleSearch.textbox_search(driver).sendKeys("automation step by step selenium");
    GoogleSearch.search_Button(driver).click(); //.sendKeys(Keys.RETURN);
    
		}
}
		
