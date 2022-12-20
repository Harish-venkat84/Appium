package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dream11_Amount {

	public static DesiredCapabilities dc;

	public static AndroidDriver<WebElement> driver;

	public static void appLaunch() throws MalformedURLException, InterruptedException {
		
		dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.app.dream11Pro");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.app.dream11.dream11.SplashActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.Button").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/"
				+ "android.widget.LinearLayout[2]/android.widget.TextView[2]").click();
		
//		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
//				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"
//				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/"
//				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
//				+ "android.widget.FrameLayout/android.widget.EditText").sendKeys("8807889553");
//		
//		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
//				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"
//				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/"
//				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]").click();
//		
//		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/"
				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[2]").click();

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/"
				+ "android.widget.LinearLayout[1]/android.widget.LinearLayout").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/"
				+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/"
				+ "android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
				+ "android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/"
				+ "android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/"
				+ "android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View").click();
		
		
		driver.findElementByXPath("(//android.widget.LinearLayout[@content-desc=\"Contest_Cards\"])[4]/android.widget.LinearLayout/"
				+ "android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/"
				+ "android.widget.Button").click();
		
		Thread.sleep(10000);
		
		driver.quit();
	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		appLaunch();
	}

}
