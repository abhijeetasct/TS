package com.appl.testmobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest {

	public static void main(String[] args) throws MalformedURLException, Exception {
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability("platformName", "Android");
		capability.setCapability("deviceName", "50a72b4b2333");
		capability.setCapability("app", "C:\\Users\\admin\\Downloads\\Flipkart Online Shopping App_v5.14_apkpure.com.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		//AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capability);
		
		System.out.println("Appium and Application launched");
		Thread.sleep(10000);
	//	driver.navigate().back();
		driver.findElement(By.id("com.flipkart.android:id/btn_skip")).click();
		
		//driver.findElement(By.className("android.widget.ImageButton")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open Drawer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@index=3])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Refrigerators']")).click();
		/*if(driver.findElement(By.xpath("//android.widget.TextView[@text='Refrigerators']")).isDisplayed()) {
			System.out.println("Refrigerator screen displayed");
		}
		else {
			System.out.println("some problem");
		}
		*/
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}


