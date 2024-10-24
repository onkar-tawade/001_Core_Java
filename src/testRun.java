

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features=".//FeatureFiles/loginPage.feature"	,
	glue="stepDef" ,
	dryRun= false ,
	monochrome = true ,
	plugin = "html:target/cucumber-report/report1.html"
		
		
		
		)


public class testRun {


	
	
}
