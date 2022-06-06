package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
		// glue means which pkg do you have the features class in?
		glue = "steps", tags = "@DbScnenario1", // the purpose of tag is, if you have multiple scenario and you want to run
											// one then put that scenarios in the tag
		monochrome = true, // #if you want to work with one Scenarios use "classpath:features",
		// and the mention which scenario you would like to work with in tag "scenario"
		dryRun = false, // its just a keyword that you need to put on. no explanation. Make it true and
						// run it. you can also comment it out and it will run it without it
		// plugin means its type of resource that you want to generate
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }

)

public class LoginRunner {

}
