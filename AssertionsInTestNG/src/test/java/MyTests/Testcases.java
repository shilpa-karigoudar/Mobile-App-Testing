package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Testcases {

	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test(){
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("click on SignIn Button");
		
		softAssert.assertEquals(true, true);
		
		System.out.println("Validate homePage");
		
		softAssert.assertEquals(true, false, "Home Page Title is Missing");
		
		System.out.println("Go to Deals Page");
		
		System.out.println("Create a Deal");
		
		softAssert.assertAll();
		
		
	}
	@Test
	public void Test2(){
		softAssert.assertEquals(true, false, "Deals Page");
		System.out.println("Deals Page ");
		softAssert.assertAll();
	}


}
