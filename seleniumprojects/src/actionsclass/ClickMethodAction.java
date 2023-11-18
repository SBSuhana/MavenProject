package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethodAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
 WebElement element = driver.findElement(By.linkText("Log in"));
 element.click();
 Actions act=new Actions(driver);
act.click().perform();
 //act.click(element).perform();
 

}
}