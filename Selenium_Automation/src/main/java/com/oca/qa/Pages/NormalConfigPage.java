package com.oca.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oca.qa.Base.TestBase;

public class NormalConfigPage extends TestBase{

	public NormalConfigPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id="normal")
	WebElement normalConfig;
	

	@FindBy(id="product")
	WebElement product;
	
	
}
