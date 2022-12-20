package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testing {

	public static AndroidDriver<WebElement> driver;
	
	public static DesiredCapabilities dc;
	
	public static void main(String[] args) throws MalformedURLException {
		
		dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
//		dc.setCapability(MobileCapabilityType.APP, "D:\\New folder (2)\\Appium\\APK\\instagram-259-0-0-16-104.apk");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver<WebElement>(url, dc);
		
		
		
		
	}

}
