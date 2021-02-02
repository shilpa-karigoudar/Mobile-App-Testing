package SamplePrograms;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScreenShotWithUniqueName {

	private static final int FILE = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "de1b6b7c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");

	
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		capabilities.setCapability("noReset", true);
		//capabilities.setCapability("fullReset", "fullReset");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);
		
		
		
		Date date = new Date();
		
		SimpleDateFormat df= new SimpleDateFormat("yyyy-mm-dd  hh-mm-ss");
		String str=df.format(df)+".png";
		

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		
		System.out.println(screenshotAs);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\Screens\\Testing\\"+str));
	}

}
