package Runnter;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resouces/features", glue = { "StepDefinations", "MyHooks" },

		plugin = { "pretty", "html:target/CucumberHTMLReport.html", "junit:target/CucumberHTMLReport.xml",
				"json:target/CucumberHTMLReport.json"

		}, 
	//	publish = true, 
		dryRun = false, tags = "@all"

)

public class TestRunner {

}
