/**
 * 
 */
package com.ninjacart.genericLibrary;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.ninjacart.objectLibrary.DirectObjects;
import com.ninjacart.objectLibrary.biFrostObjects;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebDriver;

/**
 * @author Abhijeet
 *
 */
public class GenericKeywords {

	public static AndroidDriver Appdriver;
	// public static AndroidDriver Appdriver1;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver;
	
	
	static biFrostObjects bifrost = new biFrostObjects();

	/**
	 * launchApplication method launch the application
	 * 
	 * @author Abhijeet
	 */

	public static void launchApplication() {

		try {

			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
			driver = new ChromeDriver();
			minWait();
			
//			Dimension a=driver.manage().window().getSize();
//			driver.manage().window().setSize(a);
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			int Width = (int) toolkit.getScreenSize().getWidth();
//			int Height = (int) toolkit.getScreenSize().getHeight();
			logger.log(LogStatus.INFO, "BrowsweUp", "Browser Is Up And Running");
			System.out.println("Browser launched");
			System.out.println("Android App is selected");
			
			DesiredCapabilities capabilitiesApp = new DesiredCapabilities();
			capabilitiesApp.setCapability("newCommandTimeout", "600");
			capabilitiesApp.setCapability("deviceName", "TA09409GG3");
			capabilitiesApp.setCapability("sendKeyStrategy", "setValue");
			Appdriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilitiesApp);
			minWait();
			logger.log(LogStatus.INFO, "launchApplication", "Application Is Launched");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "launchApplication", "Application Is Launched");
			Assert.fail();
		}

	}

	/**
	 * reLaunchApplication method launch the application
	 * 
	 * @author Abhijeet
	 */

	public static void reLaunchApplication() {

		try {
			System.out.println("Android App is selected");
			DesiredCapabilities capabilitiesApp = new DesiredCapabilities();
			capabilitiesApp.setCapability("newCommandTimeout", "600");
			capabilitiesApp.setCapability("sendKeyStrategy", "setValue");
			Appdriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilitiesApp);
			minWait();
			logger.log(LogStatus.INFO, "reLaunchApplication", "Application Is Launched");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "reLaunchApplication", "Application Is Launched");
			Assert.fail();
		}
	}

	
	
	/**
	 * waitTillMElementPresent method wait till element present in UI
	 * 
	 * @author Abhijeet
	 */

	public static void waitTillMElementPresent(String Str_ElemetXpath) {

		try {
			WebDriverWait wait = new WebDriverWait(Appdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Str_ElemetXpath)));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	/**
	 * fetchData method fetch data from datasheet
	 * 
	 * @return value based on success of this function
	 * 
	 * @author Abhijeet
	 */

	public static String fetchData(String str_value) {

		File file = new File("../NINJACART/src/test/resources/TestData/data.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = prop.getProperty(str_value);
		return String.valueOf(value);

	}

	/**
	 * mExists method Validate that Element is present
	 * 
	 * @author Abhijeet
	 */

	public static void mExists(String Str_XpathOfElement, String Str_discription) {

		try {
			waitTillMElementPresent(Str_XpathOfElement);
			if (Appdriver.findElement(By.xpath(Str_XpathOfElement)) != null) {
				logger.log(LogStatus.PASS, "mExists", "Validate That " + Str_discription + " Displayed");
				System.out.println("Validate That " + Str_discription + " Displayed");
			} else {
				System.out.println(Str_discription + " not Displayed");
				Assert.fail();
			}

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mExists", "Validate That " + Str_discription + " Displayed");
			e.printStackTrace();
			Assert.fail();
		}

	}

	/**
	 * mNotExists method Validate that Element is present
	 * 
	 * @author Abhijeet
	 */

	public static void mNotExists(String Str_XpathOfElement, String Str_discription) {

		try {

			if (Appdriver.findElements(By.xpath(Str_XpathOfElement)).size() < 1) {
				logger.log(LogStatus.PASS, "mNotExists", "Validate That " + Str_discription + " Not Displayed");
				System.out.println("Validate That " + Str_discription + " Not Displayed");
			} else {
				System.out.println(Str_discription + "Displayed");
				Assert.fail();
			}

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mNotExists", "Validate That " + Str_discription + " Not Displayed");
			e.printStackTrace();
			Assert.fail();
		}

	}

	/**
	 * mClick method Perform click operation on android object
	 * 
	 * @author Abhijeet
	 */

	public static void mClick(String str_Xpath, String str_discription) {
		try {
			waitTillMElementPresent(str_Xpath);
			minWait();
			Appdriver.findElement(By.xpath(str_Xpath)).click();
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "mClick", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mClick", str_discription);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * mClickWithoutWait method Perform click operation on android object
	 * Without wait
	 * 
	 * @author Abhijeet
	 */

	public static void mClickWithoutWait(String str_Xpath, String str_discription) {
		try {
			waitTillMElementPresent(str_Xpath);
			Appdriver.findElement(By.xpath(str_Xpath)).click();
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "mClickWithoutWait", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mClickWithoutWait", str_discription);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * mEnterText method perform enter operation on android object
	 * 
	 * @author Abhijeet
	 */

	public static void mEnterText(String str_Xpath, String str_Data, String str_discription) {
		try {
			waitTillMElementPresent(str_Xpath);
			Appdriver.findElement(By.xpath(str_Xpath)).click();
			Appdriver.findElement(By.xpath(str_Xpath)).clear();
			Appdriver.findElement(By.xpath(str_Xpath)).sendKeys(str_Data);
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "mEnterText", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mEnterText", str_discription);
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * mEnterTextWithoutClear method perform enter operation on android object
	 * 
	 * @author Abhijeet
	 */

	public static void mEnterTextWithoutClear(String str_Xpath, String str_Data, String str_discription) {
		try {
			waitTillMElementPresent(str_Xpath);
			minMinWait();
		//	Appdriver.findElement(By.xpath(str_Xpath)).click();
			Appdriver.findElement(By.xpath(str_Xpath)).sendKeys(str_Data);
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "mEnterText", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mEnterText", str_discription);
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * captureScreenshot method use to capture screenShot On Android Application
	 * 
	 * @author Abhijeet
	 */
	public static void captureScreenshot() throws Exception {

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMMddHHmms");
		Date now = new Date();
		File scrFile = ((TakesScreenshot) Appdriver).getScreenshotAs(OutputType.FILE);
		String strDate = sdfDate.format(now);
		File destFile = new File("Reports/screenshots/Screen_" + strDate + ".png");
		FileUtils.copyFile(scrFile, destFile);
		System.out.println("Screenshot Captured");
		logger.log(LogStatus.FAIL, "Image Captured" + logger.addScreenCapture(destFile.getPath().split("Reports/")[1]));
	}

	/**
	 * bifrostCaptureScreenshot method use to capture screenShot Of Web
	 * 
	 * @author Abhijeet
	 */
	public static void bifrostCaptureScreenshot() throws Exception {

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMMddHHmms");
		Date now = new Date();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String strDate = sdfDate.format(now);
		File destFile = new File("Reports/screenshots/Bifrost/Screen_" + strDate + ".png");
		FileUtils.copyFile(scrFile, destFile);
		System.out.println(" Bifrost Screenshot Captured");
		logger.log(LogStatus.FAIL, "Image Captured" + logger.addScreenCapture(destFile.getPath().split("Reports/")[1]));
	}

	/**
	 * scrollDown method scrolls to down the mobile screen
	 * 
	 * @author Abhijeet
	 */
	@SuppressWarnings("unchecked")
	public static void scrollDown(String m_ElementText) {
		try {
			
			Thread.sleep(1000);
			// ((AppiumDriver) Appdriver).scrollToExact(m_ElementText);

			Appdriver.scrollToExact(m_ElementText);
			Thread.sleep(1500);
			System.out.println("Scroll Down Screen To " + m_ElementText);
			logger.log(LogStatus.INFO, "scrollDown", "Scroll Down Screen To " + m_ElementText);
		} catch (Exception e) {
			logger.log(LogStatus.ERROR, "scrollDown", "Scroll Down Screen To " + m_ElementText);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * hideKeyword Method Hide Mobile Screen Keyword
	 * 
	 * @author Abhijeet
	 */

	public static void hideKeyword() {

		try {
			Thread.sleep(1000);
			Appdriver.hideKeyboard();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * minMinWait Method Sleep For 500 MiliSeconds
	 * 
	 * @author Abhijeet
	 */

	public static void minMinWait() {

		try {

			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * minWait Method Sleep For 1 Seconds
	 * 
	 * @author Abhijeet
	 */

	public static void minWait() {

		try {

			Thread.sleep(1500);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * medWait Method Sleep For 3 Seconds
	 * 
	 * @author Abhijeet
	 */

	public static void medWait() {

		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * maxWait Method Sleep For 5 Seconds
	 * 
	 * @author Abhijeet
	 */

	public static void maxWait() {

		try {

			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * longPress method Perform Long Press on android object
	 * 
	 * @author Abhijeet
	 */

	public static void longPress(String str_Xpath, String str_discription) {
		try {
			waitTillMElementPresent(str_Xpath);
			minWait();
			TouchAction Action = new TouchAction(Appdriver);
			Action.longPress(Appdriver.findElement(By.xpath(str_Xpath))).perform();
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "longPress", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "longPress", str_discription);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * getHrefAndLoad method gets the url of link/button and loads in the same
	 * 
	 * @author Abhijeet Kumar
	 */
	public static void getHrefAndLoad(String str_xpath) {
		try {
			waitTillPageLoad();
			WebElement buttonOrLink = driver.findElement(By.xpath(str_xpath));
			String url = buttonOrLink.getAttribute("href");
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * waitTillPageLoad method wait till page loade completly
	 * 
	 * @author Abhijeet Kumar
	 * @throws InterruptedException
	 */

	public static void waitTillPageLoad() throws InterruptedException {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * waitTillElementPresent method wait till element present in UI
	 * 
	 * @author Abhijeet
	 */

	public static void waitTillElementPresent(String Str_ElemetXpath) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Str_ElemetXpath)));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	/**
	 * click method Perform click operation on Web object
	 * 
	 * @author Abhijeet
	 */

	public static void click(String str_Xpath, String str_discription) {
		try {
			waitTillElementPresent(str_Xpath);
			minWait();
			driver.findElement(By.xpath(str_Xpath)).click();
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "Click", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Click", str_discription);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * exists method Validate that Element is present
	 * 
	 * @author Abhijeet
	 */

	public static void exists(String Str_XpathOfElement, String Str_discription) {

		try {
			waitTillElementPresent(Str_XpathOfElement);
			if (driver.findElement(By.xpath(Str_XpathOfElement)) != null) {
				logger.log(LogStatus.PASS, "Exists", "Validate That " + Str_discription + " Displayed");
				System.out.println("Validate That " + Str_discription + " Displayed");
			} else {
				System.out.println(Str_discription + " not Displayed");
			}

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Exists", "Validate That " + Str_discription + " Displayed");
			e.printStackTrace();
			Assert.fail();
		}

	}

	/**
	 * enterText method perform enter operation on android object
	 * 
	 * @author Abhijeet
	 */

	public static void enterText(String str_Xpath, String str_Data, String str_discription) {
		try {
			waitTillElementPresent(str_Xpath);
			driver.findElement(By.xpath(str_Xpath)).click();
			driver.findElement(By.xpath(str_Xpath)).clear();
			driver.findElement(By.xpath(str_Xpath)).sendKeys(str_Data);
			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "EnterText", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "EnterText", str_discription);
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * enterText method perform enter operation on android object
	 * 
	 * @author Abhijeet
	 */

	public static void loadURL(String str_URL) {
		try {

			waitTillPageLoad();
			driver.get(str_URL);
			System.out.println(str_URL);
			logger.log(LogStatus.INFO, "loadURL", "URL Is Loaded" + str_URL);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "loadURL", "URL Is Loaded");
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * mClickifExist method Perform click operation on android object If Present
	 * 
	 * @param str_Xpath
	 *            is Object Xpath
	 * @author Abhijeet
	 */

	public static void mClickIfExist(String str_Xpath, String str_discription) {
		try {
			medWait();
			 if (Appdriver.findElements(By.xpath(str_Xpath)).size() != 0) {
				Appdriver.findElement(By.xpath(str_Xpath)).click();
			}

			System.out.println(str_discription);
			logger.log(LogStatus.INFO, "mClickifExist", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mClickifExist", str_discription);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * clickIfExist method Perform click operation on android object If Present
	 * 
	 * @param str_Xpath
	 *            is Object Xpath
	 * @author Abhijeet
	 * @throws InterruptedException
	 */

	public boolean clickIfExist(String str_Xpath, String str_discription) throws InterruptedException {
		boolean bStatus = false;
		try {

			if (driver.findElements(By.xpath(str_Xpath)).size() != 0) {

				driver.findElement(By.xpath(str_Xpath)).click();

			}
			bStatus = true;
			logger.log(LogStatus.INFO, "clickIfExist", str_discription);
		} catch (Exception e) {
			logger.log(LogStatus.WARNING, "clickIfExist", str_discription);

			bStatus = true;
		}
		return bStatus;
	}

	/**
	 * updateQuery method Perform update action On DB
	 * 
	 * @param updateQuery
	 *            is Update Query
	 * @author Abhijeet
	 */

	public static void updateQuery(String str_query) {
		try {
			String DB =fetchDirectData("direct", "DB");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://138.201.226.177:43306/"+DB,
					"ninjacart_dev", "ZlrmUqXrju2avudeqe");
			Statement smt = con.createStatement();

			// smt.executeQuery(str_query);
			smt.executeUpdate(str_query);
			System.out.println("Query Executed");
			minWait();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * fetchQuery method Perform fetch Data ZFrom DB
	 * 
	 * @param updateQuery
	 *            is Fetch Query
	 * @author Abhijeet
	 */
	public String fetchQuery(String str_query) {

		String DBValue = null;
		try {
			String DB =fetchDirectData("direct", "DB");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://138.201.226.177:43306/"+DB,
					"ninjacart_dev", "ZlrmUqXrju2avudeqe");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(str_query);
			rs.next();
			// smt.executeUpdate(str_query);
			DBValue = rs.getString(1).replace(".0", "").replace(".00", "");
			//System.out.println("Query Executed");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

		//int DBoutput = Integer.parseInt(DBValue);

		return DBValue;
	}

	/**
	 * mBackButton method Perform Back operation on Android Mobile
	 * 
	 * @author Abhijeet
	 */

	public static void mBackButton() {
		try {
			minMinWait();
			Appdriver.navigate().back();
			minMinWait();
			System.out.println("Click On Back Button");
			logger.log(LogStatus.INFO, "mBackbutton", "Click On Mobile Back Button");
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "mBackbutton", "Click On Mobile Back Button");
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * fetchDirectData method fetch data from propertiesFile
	 * 
	 * @return value based on success of this function
	 * 
	 * @author Abhijeet
	 */
	public static String fetchDirectData(String fileName, String str_value) {

		File file = new File("../NINJACART/src/test/resources/TestData/" + fileName + ".properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = prop.getProperty(str_value);
		return String.valueOf(value);

	}

	/**
	 * ScrollDownUsingXpath method scroll down the page to the particular object
	 * in a page using java script
	 * 
	 * @author Abhijeet
	 */
	public static void ScrollDownUsingXpath(String str_Xpath) throws Exception {
		try {
			WebElement e = driver.findElement(By.xpath(str_Xpath));

			Coordinates cor = ((Locatable) e).getCoordinates();

			cor.inViewPort();
			Thread.sleep(1000);

			logger.log(LogStatus.INFO, "ScrollDownUsingXpath", "ScrollDown To Element");

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "ScrollDownUsingXpath", "ScrollDown To Element");
			e.printStackTrace();
		}
	}

	/**
	 * scrollTillElement method scroll down the page to the particular object in
	 * a page using java script
	 * 
	 * @author Abhijeet
	 */
	public void scrollTillElement(String m_ElementXpath) throws Exception {
		try {

			WebElement element = Appdriver.findElement(By.xpath(m_ElementXpath));
			((JavascriptExecutor) Appdriver).executeScript("arguments[0].scrollIntoView(true);", element);

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "scrollTillElement", "ScrollDown To ");
			e.printStackTrace();
		}
	}

	/**
	 * closeApplication Method Will CLose Application
	 * 
	 * @author Abhijeet
	 */

	public void closeApplication() {

		try {

			Appdriver.quit();
			minWait();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * validateTextfromDB Method Will validate Expected Text With DB Output
	 * 
	 * @param str_query
	 *            is DB Query
	 * @param str_expectedValue
	 *            is Expacted value
	 * @author Abhijeet
	 */

	public void validateTextfromDB(String str_query, String str_expectedValue) {

		try {
			minWait();
			String dbValue = fetchQuery(str_query);
			minWait();
			if (dbValue.equalsIgnoreCase(str_expectedValue)) {

				System.out.println("Validate That DataBase Value(" + dbValue + ") Is Matched With Expected Value("
						+ str_expectedValue + ")");
				logger.log(LogStatus.PASS, "Matched", "Validate That DataBase Value(" + dbValue
						+ ") Is Matched With Expected Value(" + str_expectedValue + ")");
			} else {
				System.out.println("Validate That DataBase Value(" + dbValue + ") Does Not Matched With Expected Value("
						+ str_expectedValue + ")");
				logger.log(LogStatus.PASS, "Matched", "Validate That DataBase Value(" + dbValue
						+ ") Does Not Matched With Expected Value(" + str_expectedValue + ")");
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
