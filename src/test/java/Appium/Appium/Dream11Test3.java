package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Dream11Test3 {
	
public static DesiredCapabilities dc;
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static LinkedList<String> al;
	
	public static LinkedList<Integer> ls;
	
	public static LinkedList<Integer> valueChange;
	
	public static int sums;
	
	public static int count;
	
	public static TouchAction touch;
	
	public static void appLaunch() throws MalformedURLException {
		
		dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.app.dream11Pro");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.app.dream11.dream11.SplashActivity");
		
		dc.setCapability("skipDeviceInitialization", "true");
		
		dc.setCapability("skipServerInstallation", "true");
		
		dc.setCapability("noReset", "true");
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
	}
	
	public static void PAKvsNEW() throws InterruptedException {
		
		String teamName = "PAK";
		
		String money = "₹32 Crores";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text = '"+teamName+"']").click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"₹32 Crores\"));"));
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.TextView[@text = '"+money+"']").click();
		
	}
	
	public static void collecting() {
		
		al = new LinkedList<>();
		
		ls = new LinkedList<>();
		
		List<AndroidElement> class1To125 = driver.findElementsByXPath("//android.view.ViewGroup");
		
		List<AndroidElement> amounts =  driver.findElementsByXPath("//android.view.ViewGroup/android.widget.TextView[contains(@text, '₹')]");
			
		for (MobileElement amount : amounts) {
			
			if (!amount.getText().equals("₹1.50 Crores")) {
					
				al.add(amount.getText());
			}
		}
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		
		List<AndroidElement> numbers =  driver.findElementsByXPath("//android.view.ViewGroup/android.widget.TextView[contains(@text, ' - ')]");
		
		for (AndroidElement num : numbers) {
			
			String[] split = num.getText().replaceAll(" ", "").split("-");
			
			Integer valueOf = (Integer.valueOf(split[1]) - Integer.valueOf(split[0])) + 1;
			
			ls.add(valueOf);
		}
		
		touch = new TouchAction(driver);
		
		touch.press(PointOption.point(300, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(300, 800)).release().perform();
		
		List<AndroidElement> amounts1 =  driver.findElementsByXPath("//android.view.ViewGroup/android.widget.TextView[contains(@text, '₹')]");
		
		for (MobileElement amount : amounts1) {
			
			for (String als : al) {
				
				if (amount.getText().equals(als)) {
					
					count++;
					
				}else {
					
					al.add(amount.getText());
				}
			}
		}
		
		List<AndroidElement> numbers1 =  driver.findElementsByXPath("//android.view.ViewGroup/android.widget.TextView[contains(@text, ' - ')]");
		
		for (AndroidElement num : numbers1) {
			
			String[] split = num.getText().replaceAll(" ", "").split("-");
			
			Integer valueOf = (Integer.valueOf(split[1]) - Integer.valueOf(split[0])) + 1;
			
			for (Integer a : ls) {
				
				if (a == valueOf) {
					
					count++;
				
				}else {
					
					ls.add(valueOf);
				}
			}
			
		}

		
	}
	
	public static void ChangingStringToInt() {
		
		valueChange = new LinkedList<>();
		
		for (String single : al) {
			
			String[] split = single.split("₹");
			
			String replaceAll = split[1].replaceAll(",", "");
			
			Integer valueOf = Integer.valueOf(replaceAll);
			
			valueChange.add(valueOf);
		}
		
	}
	
	
	public static void sum() {
		
		for (int i = 0; i < valueChange.size(); i++) {
			
			if (i <= 5) {
				
				sums = sums + valueChange.get(i);
				
			}
			
		}
		
		
		for (int i = 6; i < valueChange.size(); i++) {
			
			for (int j = 6; j < ls.size(); j++) {
				
				if (i==j) {
					
					for (int j2 = 1; j2 <= ls.get(j); j2++) {
						
						Integer integer = valueChange.get(i);
						
						sums = sums + integer;
						
					}
				}
			}
		}
		
		System.out.println(sums);
		
//		driver.quit();
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		appLaunch();
		
		PAKvsNEW();
		
		collecting();
		
		ChangingStringToInt();
		
		sum();
	}

}
