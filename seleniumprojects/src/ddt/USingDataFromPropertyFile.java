package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USingDataFromPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream fs=new FileInputStream("./testdata/data.properties");
		Properties property=new Properties();
		property.load(fs);
		driver.get(property.getProperty("url"));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("passwod"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
