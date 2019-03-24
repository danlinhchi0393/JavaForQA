package DemoCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty"},
monochrome = true,
features ="src/test/resources/DemoCucumber/Register.feature" )
public class RunCucumberTest {
}