package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void login()
	
	{
		System.out.println("iam from login");
	}
}
//invocation count :If we want to execute a one script multiple times then we will use the invocation count.It is in Sequantial order.