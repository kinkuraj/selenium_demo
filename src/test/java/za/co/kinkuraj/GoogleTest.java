package za.co.kinkuraj;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void test() {
		driver.navigate().to("https://accounts.google.com");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on the search text box and send value
		driver.findElement(By.id("identifierId")).sendKeys("something@gmail.com");

		// Click on the search button
		driver.findElement(By.xpath("div[contains(@class, 'VfPpkd-RLmnJb') and text()='Model saved']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After
	public void releaseResource() {
		driver.close();
		driver.quit();
	}

}
