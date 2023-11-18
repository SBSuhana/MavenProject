package login;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class Registration_Test extends BaseClass {
	@Test
	public void registerInDemo(){
		reg.getReglink().click();
		reg.getGender().click();
		reg.getFname().sendKeys("suhu");
		
	}
	}

