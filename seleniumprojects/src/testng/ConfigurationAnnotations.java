package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforesuit()
	{
	System.out.println("from before suit");	
	}

@BeforeTest
public void beforetest()
{
System.out.println("from before test");	
}

@BeforeClass
public void beforeclass()
{
	System.out.println("from before class");
}
@BeforeMethod
public void beoremethod()
{
	System.out.println("from before method");
}

@AfterSuite
public void aftersuit()
{
	System.out.println("from After suit");
}
@AfterTest
public void aftertest()
{
	System.out.println("from ater test");
}
@AfterClass
public void afterclass() {
	System.out.println("from after class");
	
}
@AfterMethod
public void Aftermethod()
{
	System.out.println("from after method");
	
}
@Test
public void method1()
{
	System.out.println("from method1");
}

}
