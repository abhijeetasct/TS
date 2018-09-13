/**
 * 
 */
package com.ninjacart.scripts;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ninjacart.businessLibrary.BusinessKeywords;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Abhijeet
 *
 */
public class biFrostScripts extends BusinessKeywords {

	@BeforeSuite
	public void start() {
		report = new ExtentReports("Reports/ExecutionReport.html", true);
		report.loadConfig(new File("src/test/resources/extent-config.xml"));
	}

	@BeforeMethod()
	public void clearingData() {

	}

	@Test
	public void createPurchaseOrder() {
		logger = report.startTest("createPurchaseOrder", "Validate That Purchase Order Is Creating ");

		launchAndLoginToBiFrost(fetchDirectData("bifrost", "biFrostURL"), fetchDirectData("bifrost", "biFrostUN"),
				fetchDirectData("bifrost", "biFrostPsw"));

	}
	
	
	
	

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			bifrostCaptureScreenshot();
		}
		report.endTest(logger);
		report.flush();
		driver.quit();
	}

	@AfterSuite()

	public void last() {

		report.close();

	}
}
