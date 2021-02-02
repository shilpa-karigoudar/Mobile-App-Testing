package EMI;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Base_mort {

	public Process process;
	public AndroidDriver driver;
	
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
	
	
	public void Launch_App() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		//device details
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		//app details
		capabilities.setCapability("appPackage","com.boondoggle.mortcalc");
		capabilities.setCapability("appActivity","com.boondoggle.mortcalc.MortCalc");
				
		//Appium server details
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
		//wait
		Thread.sleep(12000);
		
		
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
		
		
	}
	
	
	
	
}
