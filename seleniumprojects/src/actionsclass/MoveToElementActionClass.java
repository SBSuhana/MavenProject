package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAjwnOipBhBQEiwACyGLuq-BZuuvLQvM8a8TAPD6XrlRSP2w27J-ls36LD9grwXQnxyiltZ98xoCj_QQAvD_BwE");
Actions at=new Actions(driver);
WebElement element = driver.findElement(By.linkText("MEN"));
at.moveToElement(element).perform();

	}

}
