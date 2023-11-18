package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAjw15eqBhBZEiwAbDomEtxYx670nRvMlFqBpW36xl1VQDTwUZ1pG9kwWNz4SJBcBpnDEBnAshoCztQQAvD_BwE");
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("MEN"));
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.linkText("BRANDS"));
		act.moveToElement(element).perform();
		act.moveToElement(element1).perform();
		
		}

	
	
}
