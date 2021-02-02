package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DradAndDrop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


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

		driver.findElement(By.id("com.mobeta.android.demodslv:id/activity_title")).click();
		
		List<WebElement> ele_cont = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		
		System.out.println(ele_cont.size());
		
		String Expected_Result="Michael Brecker";
		int flag=0;
		//Touch Action
		
		TouchAction action = new TouchAction(driver);
		
		action.longPress(ele_cont.get(6)).moveTo(ele_cont.get(1)).release();
		
		action.perform();
		
		List<WebElement> ele_text = driver.findElements(By.id("com.mobeta.android.demodslv:id/text"));
		
		for(WebElement ele:ele_text){
		
			if(ele.getText().equals(Expected_Result)){
			
				flag=1;
				break;
			
			}
			
			else
				flag=0;
		}
		
		if(flag==1)
			System.out.println("pass");
		else
			System.out.println("Fail");
	
	}

}
