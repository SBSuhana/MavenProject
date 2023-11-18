package genericutility;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.RegistrationPage;


public class BaseClass {
	public static WebDriver driver;
	public JavascriptUtility js;
	public LoginPage login;
	public RegistrationPage reg;
PropertyUtility ppt=new PropertyUtility();
@BeforeClass
public void launchingTheBrowser()throws IOException
{
	if(ppt.reaingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
}else {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(ppt.reaingDataFromPropertyFile("url"));

}
@BeforeMethod
public void loadingobject()
{
	js=new JavascriptUtility();
	login=new LoginPage(driver);
	reg=new RegistrationPage(driver);
	//Pom objects
}
@AfterClass
public void closingBrowser() {
	driver.quit();
}
}

