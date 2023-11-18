package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandlesingelTAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> alltabId=driver.getWindowHandles();
		//String parentId=driver.getWindowHandle();
		String expectedTitle="AlertsDemo";
		for(String id:alltabId) {
			driver.switchTo().window(id);
		if(driver.getTitle().contains(expectedTitle))
		{
			break;
		

	}

		}
	}}
