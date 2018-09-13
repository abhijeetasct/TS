/**
 * 
 */
package com.ninjacart.scripts;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ninjacart.businessLibrary.BusinessKeywords;
import com.relevantcodes.extentreports.ExtentReports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Abhijeet
 *
 */
public class customInt extends BusinessKeywords {

	@BeforeSuite
	public void start() {
		report = new ExtentReports("Reports/ExecutionReport.html", true);
		report.loadConfig(new File("src/test/resources/extent-config.xml"));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void test() throws InterruptedException {

		logger = report.startTest("run", "Validate That Sale Order Is Creating Based On Sku Slab ");
/*
		launchApplication();
		Appdriver.get("www.facebook.com");
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		Thread.sleep(5000);
		System.out.println("started");
		WebElement element = Appdriver.findElement(By.xpath("//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']"));
		JavascriptExecutor js = (JavascriptExecutor) Appdriver;
		HashMap scrollObjects = new HashMap();
		scrollObjects.put("direction", "down");
		scrollObjects.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scrollTo", scrollObjects);
		if (element.isDisplayed()) {

			System.out.println("cauliflower displayed");
*/
	/*	Thread.sleep(5000);
		
		while(driver.findElements(By.xpath("//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']")).size()==0)
		{
			System.out.println("started");
			Dimension dimensions = Appdriver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			Appdriver.swipe(0,scrollStart,0,scrollEnd,2000);
		}
	
		if(driver.findElements(By.xpath("//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']")).size()>0)
		{
			System.out.println("cauliflower displayed");
			driver.findElement(By.xpath("//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']")).click();
			System.out.println("Clicked on cauliflower");
		}   */
	
		
		String s=fetchDirectData("direct", "DB");
		System.out.println("jdbc:mysql://138.201.226.177:43306/"+s);
		
		
		
		
		
		
	}
		
		
		
		
		}
		
	

	

