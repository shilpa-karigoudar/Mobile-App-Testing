package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NewMsgAndroid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "de1b6b7c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");

		capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", "com.android.mms.ui.MmsTabActivity");
		
		capabilities.setCapability("noReset", true);
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);

		//System.out.println(driver.getPageSource());
	 driver.findElement(By.id("fab")).click();
	 
	 Thread.sleep(2000);
	 //System.out.println(driver.getPageSource());
	driver.findElement(By.id("action_bar")).sendKeys("Krupanidhi" + Keys.ENTER);
	

	
	}

}
