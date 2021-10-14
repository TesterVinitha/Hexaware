package report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generator(String jsonFile) {

		File file = new File("C:\\Users\\Hi\\eclipse-workspace\\AutomationTesting\\JsonReport");

		Configuration configuration = new Configuration(file, "Adactin Hotel Functional Check");

		configuration.addClassifications("OS", "Window");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "92");
		List<String> l = new ArrayList<String>();
		l.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(l, configuration);
		builder.generateReports();
	}

}
