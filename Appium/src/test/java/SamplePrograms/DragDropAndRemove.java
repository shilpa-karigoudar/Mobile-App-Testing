package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DragDropAndRemove {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// Devide Details
		
		capabilities.setCapability("deviceName", "de1b6b7c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");

	
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		capabilities.setCapability("noReset", true);
		//capabilities.setCapability("fullReset", "fullReset");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);

		List<WebElement> text = driver.findElements(By.className(""));
		
		List<WebElement> rem_handle = driver.findElements(By.className(""));
		
		

		for(int i=0;i<text.size();i++){
			
			for(int j=0;j<rem_handle.size();j++){
				
				if(text.get(i).getText().equals("Michael Brecker")){
					
					rem_handle.get(i).click();
				}
			}
		}

	}

}
