package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountAndThreadPoolSize {
	@Test(invocationCount=5,threadPoolSize=5)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.quit();


}
}
//invocation count and ThreadPoolsize :If we want to execute a  one script multiple times then we will use the invocation count.It is in parallelly.