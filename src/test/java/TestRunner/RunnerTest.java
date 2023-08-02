package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFile"},
		glue={"StepDefination"},
		dryRun=false,
		tags="@LoginPage or @HomePage or @ContactPage",
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
