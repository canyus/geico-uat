package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target/cucumber", "json:target/report.json"},
		
		features= "./src/test/resources/features",
		glue ="step_definitions",
		tags= "@customer, @Vehicle" , 
		dryRun = false
	)

public class cukesRunner {

}
