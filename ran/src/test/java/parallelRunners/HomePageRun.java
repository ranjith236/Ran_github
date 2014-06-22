package parallelRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/cucumber features",
		format = {"json:target/integration_cucumber.json"},
		tags= "@AutomatedRegression"
		
		)

public class HomePageRun {

}
