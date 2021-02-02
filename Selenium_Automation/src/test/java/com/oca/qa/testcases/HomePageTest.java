package com.oca.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oca.qa.Base.TestBase;
import com.oca.qa.Pages.HomePage;
import com.oca.qa.Pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	// testcases should be independent
	// before each testcases login and after eac testcase close the browser
	
	@Test
	public void verifyHomePageTitle(){
		
		String title = homePage.verifyTitle();
		
		Assert.assertEquals(title, "HomePage" , "HomePage Title not matched"); // msg will get printed only when the title does not match
		
	}
	
	@Test
	public void clickOnNormalConfig() throws IOException{
		homePage.clickOnNormalConfig();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
