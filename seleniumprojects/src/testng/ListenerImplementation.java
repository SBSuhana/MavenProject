package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements  ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("from On TestStart"+result.getName());
		System.out.println("from On TestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("From on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("from on test failure");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("from on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("from on finish");
	}
	
}
//which is used to monitor the test case.
