package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Dream11_Test2 {

	public static DesiredCapabilities dc;
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static ArrayList<String> al;
	
	public static ArrayList<Integer> valueChange;
	
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
		
//		dc.setCapability(AndroidMobileCapabilityType.NO_SIGN, "");
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		
	}
	
	public static void pakVsBan() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'PAK']").click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"₹32 Crores\"));"));
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.TextView[@text = '₹32 Crores']").click();
		
		String num1 = driver.findElementByXPath("//android.widget.TextView[@text = '₹1,50,00,000']").getText();
		
		String num2 = driver.findElementByXPath("//android.widget.TextView[@text = '₹40,00,000']").getText();
		
		String num3 = driver.findElementByXPath("//android.widget.TextView[@text = '₹10,00,000']").getText();
		
		String num4 = driver.findElementByXPath("//android.widget.TextView[@text = '₹5,00,000']").getText();
		
		String num5 = driver.findElementByXPath("//android.widget.TextView[@text = '₹4,00,000']").getText();
		
		String num6 = driver.findElementByXPath("//android.widget.TextView[@text = '₹1,50,000']").getText();
		
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		
		al = new ArrayList<>();
		
		al.add(num1);
		al.add(num2);
		al.add(num3);
		al.add(num4);
		al.add(num5);
		al.add(num6);
		
	}
	
	public static void afterNine() throws InterruptedException {
		
		AndroidElement seven = driver.findElementByXPath("//android.widget.TextView[@text = '7 - 8']");
		
		String text = seven.getText();
		
		String replace = text.replaceAll(" ", "");
		
		String[] split = replace.split("-");
		
		Integer valueOf = (Integer.valueOf(split[1]) - Integer.valueOf(split[0]))+1;
		
		String num7 = driver.findElementByXPath("//android.widget.TextView[@text = '₹1,00,000']").getText();
		
		for (int i = 1; i <= valueOf; i++) {
			
			al.add(num7);
		}
		
		String num9 = driver.findElementByXPath("//android.widget.TextView[@text = '₹50,000']").getText();
		
		int cc = (11-9)+1;
		
		for (int i = 0; i < cc; i++) {
			
			al.add(num9);
		}
		
		String num12 = driver.findElementByXPath("//android.widget.TextView[@text = '₹9,500']").getText();
		
		int aa = (65-12)+1;
		
		for (int i = 1; i <= aa ; i++) {
			
			al.add(num12);
		}
		
		String num66 = driver.findElementByXPath("//android.widget.TextView[@text = '₹9,000']").getText();
		
		int bb = (123-66)+1;
		
		for (int i = 1; i <= bb; i++) {
			
			al.add(num66);
		}
		
		String num124 = driver.findElementByXPath("//android.widget.TextView[@text = '₹8,500']").getText();
		
		int aaa = (185 - 124) + 1;
		
		for (int i = 1; i <= aaa; i++) {
			
			al.add(num124);
		}
		
		TouchAction touch = new TouchAction(driver);
		
		touch.press(PointOption.point(300, 1700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(300, 800)).release().perform();
		
		String num186 = driver.findElementByXPath("//android.widget.TextView[@text = '₹8,000']").getText();
		
		int aab = (251 - 186) + 1;
		
		for (int i = 1; i <= aab; i++) {
			
			al.add(num186);
		}
		
		String num252 = driver.findElementByXPath("//android.widget.TextView[@text = '₹7,500']").getText();
		
		int aac = (321 - 252) + 1;
		
		for (int i = 1; i <= aac; i++) {
			
			al.add(num252);
		}
		
		String num322 = driver.findElementByXPath("//android.widget.TextView[@text = '₹7,000']").getText();
		
		int abb = (396 - 322) + 1;
		
		for (int i = 1; i <= abb; i++) {
			
			al.add(num322);
		}
		
		String num397 = driver.findElementByXPath("//android.widget.TextView[@text = '₹6,500']").getText();
		
		int abc = (476 - 397) + 1;
		
		for (int i = 1; i <= abc; i++) {
			
			al.add(num397);
		}
		
		String num477 = driver.findElementByXPath("//android.widget.TextView[@text = '₹6,000']").getText();
		
		int acc = (561 - 477) + 1;
		
		for (int i = 1; i <= acc; i++) {
			
			al.add(num477);
		}
		
		String num562 = driver.findElementByXPath("//android.widget.TextView[@text = '₹5,500']").getText();
		
		int d = (652 - 562) + 1;
		
		for (int i = 1; i <= d; i++) {
			
			al.add(num562);
		}
		
		String num653 = driver.findElementByXPath("//android.widget.TextView[@text = '₹5,000']").getText();
		
		int e = (749 - 653) + 1;
		
		for (int i = 1; i <= e; i++) {
			
			al.add(num653);
		}
		
		String num750 = driver.findElementByXPath("//android.widget.TextView[@text = '₹4,500']").getText();
		
		int abcd = (852 - 750) + 1;
		
		for (int i = 1; i <= abcd; i++) {
			
			al.add(num750);
		}
		
		touch.press(PointOption.point(300, 2200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(300, 400)).release().perform();
	
		String num853 = driver.findElementByXPath("//android.widget.TextView[@text = '₹4,000']").getText();
		
		int dd = (962 - 853) + 1;
		
		for (int i = 1; i <= dd; i++) {
			
			al.add(num853);
		}
		
		String num963 = driver.findElementByXPath("//android.widget.TextView[@text = '₹3,500']").getText();
		
		int de = (1079 - 963) + 1;
		
		for (int i = 1; i <= de; i++) {
			
			al.add(num963);
		}
		
		String num1080 = driver.findElementByXPath("//android.widget.TextView[@text = '₹3,000']").getText();
		
		int ee = (1204 - 1080) + 1;
		
		for (int i = 1; i <= ee; i++) {
			
			al.add(num1080);
		}
		
		String num1205 = driver.findElementByXPath("//android.widget.TextView[@text = '₹2,500']").getText();
		
		int dee = (1337 - 1205) + 1;
		
		for (int i = 1; i <= dee; i++) {
			
			al.add(num1205);
		}
		
		String num1338 = driver.findElementByXPath("//android.widget.TextView[@text = '₹2,000']").getText();
		
		int eed = (1478 - 1338) + 1;
		
		for (int i = 1; i <= eed; i++) {
			
			al.add(num1338);
		}
		
		String num1479 = driver.findElementByXPath("//android.widget.TextView[@text = '₹1,500']").getText();
		
		int aee = (1628 - 1479) + 1;
		
		for (int i = 1; i <= aee; i++) {
			
			al.add(num1479);
		}
		
		String num1629 = driver.findElementByXPath("//android.widget.TextView[@text = '₹1,000']").getText();
		
		int adee = (1787 - 1629) + 1;
		
		for (int i = 1; i <= adee; i++) {
			
			al.add(num1629);
		}
		
		String num1788 = driver.findElementByXPath("//android.widget.TextView[@text = '₹900']").getText();
		
		int eaa = (1956 - 1788) + 1;
		
		for (int i = 1; i <= eaa; i++) {
			
			al.add(num1788);
		}
		
		String num1957 = driver.findElementByXPath("//android.widget.TextView[@text = '₹800']").getText();
		
		int deea = (2136 - 1957) + 1;
		
		for (int i = 1; i <= deea; i++) {
			
			al.add(num1957);
		}
		
		String num2137 = driver.findElementByXPath("//android.widget.TextView[@text = '₹700']").getText();
		
		int aeed = (2327 - 2137) + 1;
		
		for (int i = 1; i <= aeed; i++) {
			
			al.add(num2137);
		}
		
		String num2328 = driver.findElementByXPath("//android.widget.TextView[@text = '₹600']").getText();
		
		int acdd = (2530 - 2328) + 1;
		
		for (int i = 1; i <= acdd; i++) {
			
			al.add(num2328);
		}
		
		String num2531 = driver.findElementByXPath("//android.widget.TextView[@text = '₹500']").getText();
		
		int ass = (2746 - 2531) + 1;
		
		for (int i = 1; i <= ass; i++) {
			
			al.add(num2531);
		}
		
		String num2747 = driver.findElementByXPath("//android.widget.TextView[@text = '₹400']").getText();
		
		int adsa = (2975 - 2747) + 1;
		
		for (int i = 1; i <= adsa; i++) {
			
			al.add(num2747);
		}
		
		String num2976 = driver.findElementByXPath("//android.widget.TextView[@text = '₹300']").getText();
		
		int ased = (3218 - 2976) + 1;
		
		for (int i = 1; i <= ased; i++) {
			
			al.add(num2976);
		}
		
		String num3219 = driver.findElementByXPath("//android.widget.TextView[@text = '₹200']").getText();
		
		int abs = (3476 - 3219) + 1;
		
		for (int i = 1; i <= abs; i++) {
			
			al.add(num3219);
		}
		
		String num3477 = driver.findElementByXPath("//android.widget.TextView[@text = '₹190']").getText();
		
		int sad = (3750 - 3477) + 1;
		
		for (int i = 1; i <= sad; i++) {
			
			al.add(num3477);
		}
		
		String num3751 = driver.findElementByXPath("//android.widget.TextView[@text = '₹180']").getText();
		
		int sma = (4041 - 3751) + 1;
		
		for (int i = 1; i <= sma; i++) {
			
			al.add(num3751);
		}
		
		String num4042 = driver.findElementByXPath("//android.widget.TextView[@text = '₹170']").getText();
		
		int sum = (4350 - 4042) + 1;
		
		for (int i = 1; i <= sum; i++) {
			
			al.add(num4042);
		}
		
		String num4351 = driver.findElementByXPath("//android.widget.TextView[@text = '₹160']").getText();
		
		int asm = (4678 - 4351) + 1;
		
		for (int i = 1; i <= asm; i++) {
			
			al.add(num4351);
		}
		
		touch.press(PointOption.point(300, 2200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(300, 400)).release().perform();
		
		String num4679 = driver.findElementByXPath("//android.widget.TextView[@text = '₹150']").getText();
		
		int sam = (5026 - 4679) + 1;
		
		for (int i = 1; i <= sam; i++) {
			
			al.add(num4679);
		}
		
		String num5027 = driver.findElementByXPath("//android.widget.TextView[@text = '₹140']").getText();
		
		int suma = (5395 - 5027) + 1;
		
		for (int i = 1; i <= suma; i++) {
			
			al.add(num5027);
		}
		
		String num5396 = driver.findElementByXPath("//android.widget.TextView[@text = '₹130']").getText();
		
		int asws = (5787 - 5396) + 1;
		
		for (int i = 1; i <= asws; i++) {
			
			al.add(num5396);
		}
		
		String num5788 = driver.findElementByXPath("//android.widget.TextView[@text = '₹120']").getText();
		
		int aws = (6203 - 5788) + 1;
		
		for (int i = 1; i <= aws; i++) {
			
			al.add(num5788);
		}
		
		String num6204 = driver.findElementByXPath("//android.widget.TextView[@text = '₹90']").getText();
		
		int amw = (6644 - 6204) + 1;
		
		for (int i = 1; i <= amw; i++) {
			
			al.add(num6204);
		}
		
		String num6645 = driver.findElementByXPath("//android.widget.TextView[@text = '₹80']").getText();
		
		int amws = (7112 - 6645) + 1;
		
		for (int i = 1; i <= amws; i++) {
			
			al.add(num6645);
		}
		
		String num7113 = driver.findElementByXPath("//android.widget.TextView[@text = '₹70']").getText();
		
		int ammws = (7609 - 7113) + 1;
		
		for (int i = 1; i <= ammws; i++) {
			
			al.add(num7113);
		}
		
		String num7610 = driver.findElementByXPath("//android.widget.TextView[@text = '₹60']").getText();
		
		int awwsw = (435394 - 7610) + 1;
		
		for (int i = 1; i <= awwsw; i++) {
			
			al.add(num7610);
		}
		
		String num435395 = driver.findElementByXPath("//android.widget.TextView[@text = '₹49']").getText();
		
		int amn = (5816804 - 435395) + 1;
		
		int count = 0;
		
		for (int i = 1; i <= amn; i++) {
			
			count++;
			
			al.add(num435395);
		}
		
		if (count == amn) {
			
			System.out.println("!Done");
		}
		
	}
	
	
	public static void removing() {
		
		valueChange = new ArrayList<>();
		
		for (int i = 0; i < al.size(); i++) {
		
			int count = 0;
			
			String nonRemove = al.get(i);
			
			String[] split = nonRemove.split("₹");
			
			String ref = split[1];
			
			String replaceAll = ref.replaceAll(",", "");
			
//			String number = "";
//			
//			char[] charArray = ref.toCharArray();
//			
//			for (int j = 0; j < charArray.length; j++) {
//				
//				if (charArray[j] == ',') {
//					
//					count++;
//					
//				}else {
//					
//					number = number + charArray[j];
//					
//				}
//				
//			}
			
			Integer valueOf = Integer.valueOf(replaceAll);
			
			valueChange.add(valueOf);
		}
		
	}
	
	
	public static void sum() {
		
		int a = 0;
		
		for (int i = 0; i < valueChange.size(); i++) {
			
			Integer integer = valueChange.get(i);
			
			a = a+integer;
			
		}
		
		System.out.println(a);
		
//		driver.quit();
	}
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		appLaunch();
		
		pakVsBan();
		
		afterNine();
		
		removing();
		
		sum();

	}

}
