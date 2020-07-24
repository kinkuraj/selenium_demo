package za.co.kinkuraj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScriptFirefox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("something@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}
}