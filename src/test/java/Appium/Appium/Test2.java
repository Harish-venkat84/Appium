package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test2 {

	public static DesiredCapabilities dc;
	
	public static AndroidDriver<WebElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
		Thread.sleep(5000);
		
		driver.findElementById("com.google.android.calculator:id/digit_9").click();
		
		driver.findElementById("com.google.android.calculator:id/op_add").click();
		
		driver.findElementById("com.google.android.calculator:id/digit_5").click();
		
//		driver.findElementById("com.google.android.calculator:id/op_add").click();
		
		driver.findElementById("com.google.android.calculator:id/eq").click();
		
		String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
		
		Thread.sleep(2000);
		
		System.out.println(result);

	}

}
