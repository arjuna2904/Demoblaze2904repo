package testNGlistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNg implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution start");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test execution success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test execution failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}


}
