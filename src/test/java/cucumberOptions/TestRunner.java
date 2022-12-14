
package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "steps",
		stepNotifications = true,
		tags="@RegTest",
		plugin= {"pretty","html:target/cucumberreport.html"})
public class TestRunner {

}

