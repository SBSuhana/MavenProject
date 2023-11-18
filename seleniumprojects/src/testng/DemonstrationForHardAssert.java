package testng;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstrationForHardAssert {
@Test
public void Demo()
{
	String ExpectedTitle="demo";
	String actualTitle="dm";
	//HardAssert
	//assertEquals(actualTitle,ExpectedTitle);
	/*assertEquals(actualTitle,ExpectedTitle,"the condition is not matching");*/
	//Softassert
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actualTitle,ExpectedTitle );
	System.out.println("done");
	soft.assertAll();
	
	
}
}
//In hard assert if the condition is  false it will terminated the loop
//But in Soft assert it will not terminate the loop until we call method called assertAll().