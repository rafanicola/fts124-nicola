package google2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		//mais ou menos informações no log
		dryRun = false,
		monochrome = true,		
		
		//onde estão as features
		features = { "src/test/resources/features/" },
		glue = {"google2/"},
		
		//plugins
		plugin = {
				"pretty",
				"html:target/cucumber-extentsreport.html",
				"json:target/cucumber-extentsreport.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/extentreports/dashboard.html"
		}
)

//classe de gatilho - aponta tanto para feature quanto para a de java de steps

public class Runner {

}
