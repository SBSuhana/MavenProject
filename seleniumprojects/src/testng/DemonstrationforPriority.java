package testng;

import org.testng.annotations.Test;

public class DemonstrationforPriority {
	//@Test(priority=-1)
	@Test
	public void login()
	
	{
		System.out.println("iam from login");
	}
	//@Test(priority=-1)
	@Test
	public void home()
	{
		System.out.println("iam from home");
	}
	//@Test(priority=0)
	@Test
	public void loguot()
	
	{
		System.out.println("iam from logout");
	}

}
