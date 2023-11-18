package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChrmeOptionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//to handle Notification Popup
		option.addArguments("--disable-notifications");
		//to Open browser in cognative mode
		option.addArguments("--incognito");
		//to oen Browser in maximize mode
		option.addArguments("start-maximized");
		//to open browser in headless mode
		option.addArguments("--headless");
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.ajio.com/");
	System.out.println("browser is navigated to ajio");
	driver.quit();
	System.out.println("browser is closed");
	

	}

}
