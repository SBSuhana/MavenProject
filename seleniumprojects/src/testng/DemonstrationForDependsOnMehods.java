package testng;

import org.testng.annotations.Test;

public class DemonstrationForDependsOnMehods {
	@Test
	public void login()
	
	{
		System.out.println("iam from login");
	}
	//@Test(dependsOnMethods="home")...It will give u Exception like cyclic dependencies
	//@Test(dependsOnMethods="home")(priority=25)...here we can use priority also
	@Test(dependsOnMethods="login")
	public void home()
	{
		System.out.println("iam from home");
	}
	//@Test(dependsOnMethods="logout")...It will give u Exception like cyclic dependencies
	@Test(dependsOnMethods="home")
	public void loguot()
	
	{
		System.out.println("iam from logout");
	}

}

