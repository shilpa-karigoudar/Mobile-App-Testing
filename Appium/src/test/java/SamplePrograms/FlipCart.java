package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class FlipCart {

	
	public static void main(String args[]) throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "de1b6b7c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");

		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		capabilities.setCapability("noReset", true);
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.flipkart.android:id/search_widget_textbox"))).isDisplayed();
		
		driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.flipkart.android:id/Search_autoCompleteTextView")).sendKeys("Reebok Shoes");
		
		Thread.sleep(3000);
		
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		
		
		
		
	}
}
