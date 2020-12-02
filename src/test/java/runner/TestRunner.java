package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=("./src/test/java/featureFiles/cityBike.feature"),
        glue =  {"stepDefinitions"},
        plugin = { "pretty",  
        		   "junit:target/cucumber-reports/Cucumber.xml",
        		   "json:target/surefire-reports/Cucumber.json",
				   "html:target/surefire-reports"}
)

public class TestRunner {
}





