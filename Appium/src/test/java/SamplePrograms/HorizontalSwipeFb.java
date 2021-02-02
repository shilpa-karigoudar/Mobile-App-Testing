package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HorizontalSwipeFb {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

	DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// Devide Details
		
		capabilities.setCapability("deviceName", "de1b6b7c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");

		capabilities.setCapability("appPackage", "com.facebook.katana");
		capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		
		capabilities.setCapability("noReset", true);
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println("Dimension the Device "+size);
		
		int startx = (int) (size.width*0.90);
		
		System.out.println("startx :"+startx);
		
		int starty= (int) (size.height*0.50);
		
		int endx = (int) (size.width*0.10);
		
		//int endy = (int) (size.height*0.50);
		
		
		for(int i=0;i<=5;i++){
		driver.swipe(startx, starty, endx, starty, 1000);
		
		
		}
		
		System.out.println("Swipe from Right to Left is done");
		
		int startx1 = (int) (size.width*0.10);
		
		System.out.println("startx :"+startx);
		
		int starty1= (int) (size.height*0.50);
		
		int endx1 = (int) (size.width*0.90);
		
		//int endy = (int) (size.height*0.50);
		
		
		for(int i=0;i<=5;i++){
		driver.swipe(startx1, starty1, endx1, starty1, 1000);
		
		
		}
		
		System.out.println("Swipe from Left to Right is done");
	}

}
