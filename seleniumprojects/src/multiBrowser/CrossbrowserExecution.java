package multiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserExecution {
	@Test
	@Parameters("browser")
	public void amazon(String browser) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		if(browser.equals("chrome")) {
		    driver.get("https://www.amazon.com");

		}
		else {
		    driver.get("https://www.flipkart.com");

		}
	
}
}