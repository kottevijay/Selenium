package testCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@SmokeTest or @Login"),
				plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
				monochrome=true)
					
public class testRunner 
{

}
