package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("");
		driver.findElement(By.id("windows")).click();
		Set<String> allWindowId=driver.getWindowHandles();
		//String parentId=driver.getWindowHandle();
		String ExpectedTitle="Bascic";
		for(String Id:allWindowId)
		{
			driver.switchTo().window(Id);
		
		if(driver.getTitle().contains(ExpectedTitle))
		{
			break;
		}
	}

}
}
