package testngexecution;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc1 {
	@Test(groups="smoke testing")
	public void amazon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	Thread.sleep(2000);
	//to fail a test script
		assertTrue(false);
	 driver.quit();
	}
	}

