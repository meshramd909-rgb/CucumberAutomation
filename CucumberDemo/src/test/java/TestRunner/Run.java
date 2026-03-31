package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.platform.engine.Cucumber;

@RunWith(Cucumber.class)
@Cucumber(
		features = ".//Features/LoginFeature.feature",
		glue="StepDefinition",
		dryRun = true
		)

public class Run {
	
// This class will be empty

//	for git 
}
