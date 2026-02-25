package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/form.feature",
		  glue="stepDefination", dryRun = false,
		  plugin = { "pretty","html:target/cucumber-reports/cucumber.html",
				  
		  }, monochrome = true, publish = true
		
		)
public class runner extends AbstractTestNGCucumberTests {

}
