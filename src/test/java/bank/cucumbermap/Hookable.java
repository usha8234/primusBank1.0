package bank.cucumbermap;

import java.net.UnknownHostException;

import bank.methods.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable {

	
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("c:\\report\\bank.html", "primusbank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	}

	@After
	public void after(Scenario scenario)
	
	{
		
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
	
	
	
	
}
