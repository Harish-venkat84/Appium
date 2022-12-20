package com.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Checking {
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static DesiredCapabilities dc;
	
	public static WebDriverWait wait;
	
	public static void appiumLaunch() throws MalformedURLException {
		
		dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		
//		dc.setCapability("skipDeviceInitialization", "true");
//		
//		dc.setCapability("skipServerInstallation", "true");

		dc.setCapability("noReset", "true");
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
	}
	
	public static void appLaunch() {
		
		wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.chrome:id/search_box_text"))).click();
		
		driver.findElementById("com.android.chrome:id/url_bar").sendKeys("apk");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text = 'apk']"))).click();
		
		TouchAction touch = new TouchAction(driver);
		
		touch.press(PointOption.point(500,1950)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(500,600)).release().perform();

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//android.view.View[contains (@text , 'APKMirror - Free APK Downloads')]"))).click();
	}

	public static void main(String[] args) throws MalformedURLException {
		
		appiumLaunch();
		
		appLaunch();
	}
}
