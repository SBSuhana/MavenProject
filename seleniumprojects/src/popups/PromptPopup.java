package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("yes");
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		alert.sendKeys("suhu");
		alert.dismiss();
	}

}
