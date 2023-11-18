package actionsclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAcion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//WebElement element = driver.findElement(By.xpath(//input[@id='small-searchterms']));
Actions at=new Actions(driver);
	at.doubleClick().perform();
	//at.moveToElement(element).doubleClick().perform();
	}

}
