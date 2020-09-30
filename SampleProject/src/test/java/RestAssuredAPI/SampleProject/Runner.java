package RestAssuredAPI.SampleProject;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-reports/CucumberTestReport.json"},
		glue = {"RestAssuredAPI.SampleProject"},
		features = {"src/test/java/RestAssuredAPI/SampleProject"})
public class Runner {

}
