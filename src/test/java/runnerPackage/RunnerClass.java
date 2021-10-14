package runnerPackage;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import report.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {
		"ExecuteTestCase" }, monochrome = true, dryRun = false, plugin = {
				"json:C:\\Users\\Hi\\eclipse-workspace\\AutomationTesting\\Output\\out.json" })
public class RunnerClass {

	@AfterClass
	public static void result() {

		JvmReport.generator("C:\\Users\\Hi\\eclipse-workspace\\AutomationTesting\\Output\\out.json");

	}
}