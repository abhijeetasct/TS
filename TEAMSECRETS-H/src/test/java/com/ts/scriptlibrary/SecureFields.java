/**
 * 
 */
package com.ts.scriptlibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.relevantcodes.extentreports.ExtentReports;
import com.ts.businesslibrary.BusinessKeywords;

/**
 * @author user
 *
 */
public class SecureFields extends BusinessKeywords {

	// String URL = "http://jira-data-center.hyfy.io/browse/TEAM-4";
	// com.ts.repositorylibrary.TeamSecrets ts = new
	// com.ts.repositorylibrary.TeamSecrets();
	//
	// @BeforeSuite
	// public void start() throws FilloException {
	//
	// report = new ExtentReports("Reports/ExecutionReport.html", true);
	// report.loadConfig(new File("src/test/resources/extent-config.xml"));
	//
	// }
	//
	// @Test
	//
	// public void testUpload() throws Exception {
	// logger = report.startTest("Validate team sceret panel is available",
	// "Test Case Number 1");
	// launchApplication();
	// driver.get(URL);
	// Thread.sleep(30000);
	// System.out.println("wait over");
	// switchToiFrame(5);
	// existsWithScreenshot(ts.postaTeamSecretPage, "Post a team secrets page");
	//
	// WebElement element = driver.findElement(By.xpath(ts.selectFiles));
	// element.click();
	//
	// Screen screen = new Screen();
	// // Create object of Pattern class and specify the images path
	//
	// Pattern user = new Pattern("/Users/user/Files/User.png");
	//
	// Pattern files = new Pattern("/Users/user/Files/Files.png");
	//
	// Pattern filetype = new Pattern("/Users/user/Files/ZeroByte.png");
	//
	// Pattern openBtn = new Pattern("/Users/user/Files/Open.png");
	//
	// Pattern maxSize = new Pattern("/Users/user/Files/maxSize.png");
	//
	// Actions actions = new Actions(driver);
	// actions.keyDown(Keys.COMMAND).sendKeys(Keys.TAB).build().perform();
	// minWait();
	// screen.click(user);
	// screen.doubleClick(files);
	// screen.click(filetype);
	// screen.click(openBtn);
	// medWait();
	// Click(ts.addNewFile, "click");
	// screen.click(user);
	// screen.doubleClick(files);
	// screen.click(maxSize);
	// screen.click(openBtn);
	//
	// // File Need to be imported
	// //
	// // File file = new
	// //
	// File("/Users/user/Documents/Abhijeet/Workspace/TEAMSECRETS-H/TestData/Files/Zerobtye.txt");
	// //
	// // StringSelection stringSelection= new
	// // StringSelection(file.getAbsolutePath());
	// //
	// // //Copy to clipboard
	// //
	// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
	// // null);
	// //
	// //
	// //
	// // Robot robot = new Robot();
	// //
	// // // Cmd + Tab is needed since it launches a Java app and the browser
	// // looses focus
	// //
	// // robot.keyPress(KeyEvent.VK_META);
	// //
	// // robot.keyPress(KeyEvent.VK_TAB);
	// //
	// // robot.keyRelease(KeyEvent.VK_META);
	// //
	// // robot.keyRelease(KeyEvent.VK_TAB);
	// //
	// // robot.delay(500);
	// //
	// // //Open Goto window
	// //
	// // robot.keyPress(KeyEvent.VK_META);
	// //
	// // robot.keyPress(KeyEvent.VK_SHIFT);
	// //
	// // robot.keyPress(KeyEvent.VK_G);
	// //
	// // robot.keyRelease(KeyEvent.VK_META);
	// //
	// // robot.keyRelease(KeyEvent.VK_SHIFT);
	// //
	// // robot.keyRelease(KeyEvent.VK_G);
	// //
	// // //Paste the clipboard value
	// //
	// // robot.keyPress(KeyEvent.VK_META);
	// //
	// // robot.keyPress(KeyEvent.VK_V);
	// //
	// // robot.keyRelease(KeyEvent.VK_META);
	// //
	// // robot.keyRelease(KeyEvent.VK_V);
	// //
	// // //Press Enter key to close the Goto window and Upload window
	// //
	// // robot.keyPress(KeyEvent.VK_ENTER);
	// //
	// // robot.keyRelease(KeyEvent.VK_ENTER);
	// //
	// // robot.delay(500);
	// //
	// // robot.keyPress(KeyEvent.VK_ENTER);
	// //
	// // robot.keyRelease(KeyEvent.VK_ENTER);
	// //
	// // }
	// }

	public WebDriver driver;

	@Parameters("browser")

	@BeforeTest

	public void beforeTest(String browser) throws InterruptedException {

		// If the browser is Firefox, then do this

		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"/Users/user/Documents/Abhijeet/Workspace/TEAMSECRETS-H/src/test/resources/Drivers/geckodriver");

			driver = new FirefoxDriver();
			driver.manage().window().fullscreen();

			// If browser is chrome, then do this

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Here I am setting up the path for my IEDriver
			System.setProperty("webdriver.chrome.driver",
					"/Users/user/Documents/Abhijeet/Workspace/TEAMSECRETS-H/src/test/resources/Drivers/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			minWait();
			driver.manage().window().fullscreen();
			System.out.println("Launch application end");
		
		}

		// Doesn't the browser type, lauch the Website

	}

	@Test

	public void test1() throws InterruptedException {
		driver.get("http://www.store.demoqa.com");
		Thread.sleep(9000);

	}
}
