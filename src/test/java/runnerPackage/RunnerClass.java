package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import report.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {
		"ExecuteTestCase" }, monochrome = true, dryRun = false, plugin = {
				"json:eclipse-workspace\\AutomationTesting\\reports\\out.json" })
public class RunnerClass {

	public void result() {

		String path = System.getProperty("user.dir");

		JvmReport.generator(path + "eclipse-workspace\\AutomationTesting\\reports\\res.json");

	}

}