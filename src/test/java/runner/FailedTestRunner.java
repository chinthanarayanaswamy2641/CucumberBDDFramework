package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed_scenarios.txt",
           glue= {"stepdefinitions","myhooks"},
           publish=true,
plugin= {"pretty","html:target/CucumberReports/CucumberFailedReport.html"}
          
           
		)
public class FailedTestRunner {

}
