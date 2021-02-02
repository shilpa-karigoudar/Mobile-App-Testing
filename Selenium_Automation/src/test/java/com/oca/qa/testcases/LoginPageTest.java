package com.oca.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.oca.qa.Base.TestBase;
import com.oca.qa.Pages.HomePage;
import com.oca.qa.Pages.LoginPage;


public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException {
		super();             //Call Super class Constructor - which is TestBase class constructor - properties
	}

	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage=new LoginPage();
		
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "OCA");
		
	}
	
	@Test(priority=2)
	public void ocaLogoTest(){
		Boolean Logo = loginPage.validateLoginPageLogo();
		Assert.assertTrue(Logo);
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	@AfterMethod
	public void tearDown(){
		
	}
	
}
