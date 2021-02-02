package com.oca.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oca.qa.Base.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="normal")
	WebElement normalConfig;
	
	
	@FindBy(id="normal")
	WebElement HomePageLogo;

	
	public String verifyTitle(){
		return driver.getTitle();

	}
	
	public NormalConfigPage clickOnNormalConfig() throws IOException{
		normalConfig.click();
		
		return new NormalConfigPage();
	}
	
	
}
