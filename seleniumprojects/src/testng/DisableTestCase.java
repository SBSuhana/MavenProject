package testng;

import org.testng.annotations.Test;

public class DisableTestCase {
	@Test(priority=10)
	public void login()
	
	{
		System.out.println("iam from login");
	}
	@Test(priority=-0)
	public void home()
	{
		System.out.println("iam from home");
	}
	@Test(priority=-1,enabled=false)
	public void loguot()
	
	{
		System.out.println("iam from logout");
	}

}


