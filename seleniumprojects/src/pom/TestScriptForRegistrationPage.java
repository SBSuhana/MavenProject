package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptForRegistrationPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		 RegistrationPage page=new RegistrationPage(driver);
		 page.getRegister().click();
		 page.getGender().click();
		 page.getFirstName().sendKeys("chotabheem");
		 page.getLastName().sendKeys("chutki");
		 page.getEmail().sendKeys("chotachutki@gmail.com");
		 page.getPassword().sendKeys("chutki@123");
		 page.getConfirmPassword().sendKeys("chutki@123");
		 page.getRegisterclick().click();
}
}
