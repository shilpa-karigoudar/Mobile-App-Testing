package com.oca.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.oca.qa.Util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public  static Properties prop;
	
	public TestBase() throws IOException{
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C://DXC_Shilpa//OCA_Automation//Selenium_Automation//src//main//java//com//oca//qa//Config//config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
	}
	
}
	
	public static void initialization(){
		String browserName = prop.getProperty("browserName");
		
		if(browserName.equals("Chrome")){
			System.setProperty("wedriver.chrome.driver","C://DXC_Shilpa//OCA_Automation//Selenium_Automation//src//main//java//com//oca//qa//Util//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("Firefox")){
			System.setProperty("wedriver.gecko.driver",prop.getProperty("firefoxDriverPath"));
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeOut, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
	}
	
	
}