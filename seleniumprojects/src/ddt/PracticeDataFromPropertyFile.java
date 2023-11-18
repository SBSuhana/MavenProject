package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDataFromPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileInputStream fs=new FileInputStream("./testdata/data.properties");
		Properties property=new Properties();
		property.load(fs);
		Thread.sleep(2000);
		driver.get(property.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(property.getProperty("passwod"));
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}


