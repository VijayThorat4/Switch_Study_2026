package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vtt1\\eclipse_Mar10\\MavenPro\\src\\main\\java\\Features\\login.feature",
		glue= {"StepDefinition"},
		format= {"pretty", "html:test-output"}
		)

public class TestRunner {

}
