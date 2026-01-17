package ListenerConcept;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{
	

	public void onTestFailure(ITestResult result) {
		try {
			System.out.println(result.getMethod().getMethodName() + "_failed");
			failed(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
