package Generic_Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base_class {
	
	public Process process;
	public AppiumDriver driver;
	
	public static ExtentReports extentreport;
	public static ExtentTest extentest;
	
	public void Start_Server() throws IOException, InterruptedException
	{
		String Start_Server="D:\\Appium\\node.exe   D:\\Appium\\node_modules\\appium\\bin\\appium.js";
		process = Runtime.getRuntime().exec(Start_Server);
		
		if(process != null)
		{
			System.out.println("Appium Server is Started");
		}
		else
		{
			System.out.println("NOT Started the Appium server");
		}
		
		
		Thread.sleep(12000);
		
		//*************************************************************	
		
		
	}
	
	
	public void Launch_App() throws InterruptedException, IOException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		//device details
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		//app details
		capabilities.setCapability("appPackage",Utility_Class.Read_properties("Package_name"));
		capabilities.setCapability("appActivity",Utility_Class.Read_properties("Activity_name"));
				
		//Appium server details
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
		//wait
		Thread.sleep(3000);
		
		
	}
	
	@BeforeSuite
	public static void Report_Extent()
	{
		
		Date date= new Date();
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		String str=df.format(date);
		
		
		extentreport= new ExtentReports("D:\\Jul4_Framework\\Report\\"+"BBProject"+"-"+str+".html",false);
		
		
	}
	
	
	
	public String Capture_Screenshot(String TC_ID,String Order_Set) throws IOException
	{
		Date date= new Date();
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String str=df.format(date)+".png";
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Jul4_Framework\\Screenshot\\"+TC_ID+"-"+Order_Set+"-"+str));
		
		String Path="D:\\Jul4_Framework\\Screenshot\\"+TC_ID+"-"+Order_Set+"-"+str;
		
		return Path;
		
	}
	
	
	
	
	
	
	
	
	public void Explicit_wait(WebElement ele,long T1)
	{
		WebDriverWait wait= new WebDriverWait(driver, T1);
		wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
		
	}
	
	
	
	public void Stop_Server() throws InterruptedException
	{
		 //Stop the server
		 if(process!=null)
		 {
			 process.destroy();
			 Thread.sleep(4000);
			 System.out.println("Stopped the Server");
			 
		 }
		
		 extentreport.endTest(extentest);
		 extentreport.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
