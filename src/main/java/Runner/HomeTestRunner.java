package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 
@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		//the path of the feature files
		features = "C:\\Users\\RashmiP2\\eclipse-workspace\\FreeCrmBDDFramwork\\src\\main\\java\\Features\\FreeCRM_Home.feature", 
		
		//the path of the step definition files
		glue={"HomeStepDefinition"}, 
		
		//to generate different types of reporting
		format = {"pretty","html:html-test-output","json:json-test-output/cucumber.json","junit:junit-xml-output/cucumber.xml"},
		
		
		// dryRun the test cases
		dryRun = false,
		
		//Format Console Output
		monochrome = false
		
		//tagging
		//tags= {"@SmokeTest "}
		//,@RegressionTest
		)
public class HomeTestRunner {

}
