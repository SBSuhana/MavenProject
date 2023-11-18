package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultipleTabs {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> allTitleId=driver.getWindowHandles();
		//String parentId=driver.getWindowHandle();
		String expectedTitle="Basic Controls";
		for(String id:allTitleId) {
			driver.switchTo().window(id);
		if(driver.getTitle().contains(expectedTitle)) {
		
			
		break;

	}

}
	}
}
