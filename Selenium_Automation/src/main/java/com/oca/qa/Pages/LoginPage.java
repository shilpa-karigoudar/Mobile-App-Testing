package com.oca.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oca.qa.Base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);  // this - pointing to the current class object
		//super();
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="LoginButton")
	WebElement LoginButton;
	
	@FindBy(id="Logo")
	WebElement LoginPageLogo;
	
	//Methods Or Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Boolean validateLoginPageLogo(){
		return LoginPageLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) throws IOException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		
		return new HomePage();
	}

}
