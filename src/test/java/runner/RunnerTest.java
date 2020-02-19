package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

//Esta classe define o Runner para a execução dos cenários

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import support.BaseSteps;
/*
 * This class implements all the necessary methods for runer execution, here ou can change the Tags or implements report specifications
 */

@RunWith(Cucumber.class)
@CucumberOptions
		(features = {"src/test/resources/features"}, 
		plugin = {"json:target/reports/CucumberReport.json",
				"pretty",
				"html:target/cucumber-reports"},
        glue = "steps", tags = {"~@ignore"},
		monochrome = true

		)
public class RunnerTest extends BaseSteps {
	@AfterClass
	public static void tearDown() {
		driver.quit();
	} 
}

