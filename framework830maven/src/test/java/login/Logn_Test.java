package login;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class Logn_Test extends BaseClass {
	@Test
	public void loginToDemo() {
		login.getLoginlink().click();
		login.getEmailtf().sendKeys("pallu@123");
		
	}

}