package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	/*	Thread.sleep(2000);
		alert.accept();//gives noalertpresentexception */
		
	/*	driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		alert.dismiss();*/
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();//unhandled alertexception

		
		driver.quit();


	}
	

}
