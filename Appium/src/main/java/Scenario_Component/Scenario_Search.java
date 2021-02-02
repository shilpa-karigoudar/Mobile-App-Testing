package Scenario_Component;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;



import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Component.Base_class;
import PageObject_Component.PageObject_Search;

public class Scenario_Search extends Base_class {
	
	public static Logger Log= Logger.getLogger(Scenario_Search.class);
	
	@Test(dataProvider="dp_InvalidSearch", dataProviderClass=DataProvider_Component.DataProvider_testdata.class, groups={"smoke"})
	public void testInvalidSearchdata(Map<String,String> Search) throws IOException, InterruptedException
	{
		SoftAssert sAssert= new SoftAssert();
		
		String TC_ID = Search.get("TC_ID");
		String Order_Set = Search.get("Order_Set");
		String Search_Item = Search.get("Search_Item");
		String Exp_Result = Search.get("Exp_Result");		
		
		extentest= extentreport.startTest(TC_ID);
		extentest.log(LogStatus.PASS, "Executing Testcase " +TC_ID+ " Order set is "+Order_Set);
		
		Log.info("Executing Testcase " +TC_ID+ " Order set is "+Order_Set);
		
		
		Start_Server();
		Launch_App();
		
		PageObject_Search BS_Pob= new PageObject_Search(driver);
		
		Explicit_wait(BS_Pob.Search_txtbox,30);
		BS_Pob.EnterSearchitem(Search_Item);
		
		Explicit_wait(BS_Pob.Invalid_msg, 30);
		String Actual_Result = BS_Pob.getInvalidSearchmsg();
		
		if(Actual_Result.equals(Exp_Result))
		{
			Log.info("Passed as Actual Result is  " +Actual_Result + " Expected Result is " +Exp_Result);			
			Capture_Screenshot(TC_ID, Order_Set);
			extentest.log(LogStatus.PASS, "Passed as Actual Result is  " +Actual_Result + " Expected Result is " +Exp_Result,extentest.addScreenCapture(Capture_Screenshot(TC_ID, Order_Set)));
		}
		else
		{
			Log.info("Failed as Actual Result is  " +Actual_Result + " Expected Result is " +Exp_Result);
			Capture_Screenshot(TC_ID, Order_Set);
			extentest.log(LogStatus.FAIL, "Passed as Actual Result is  " +Actual_Result + " Expected Result is " +Exp_Result, extentest.addScreenCapture(Capture_Screenshot(TC_ID, Order_Set)));
			
			
			sAssert.fail("Failed as Actual Result is  " +Actual_Result + " Expected Result is " +Exp_Result);
			
						
		}
		
		
		Stop_Server();
		sAssert.assertAll();
		
		
	}
	
//*************************************************************************
	@Test(dataProvider="dp_ValidSearch", dataProviderClass=DataProvider_Component.DataProvider_testdata.class, groups={"regression"})
	public void testValidSearch(Map<String,String> Search) throws IOException, InterruptedException
	{
		SoftAssert sAssert= new SoftAssert();
		
		String TC_ID = Search.get("TC_ID");
		String Order_Set = Search.get("Order_Set");
		String Search_Item = Search.get("Search_Item");
		String Exp_Result = Search.get("Exp_Result").replace(".0", "");
		
		Start_Server();
		Launch_App();
		
		PageObject_Search BS_Pob= new PageObject_Search(driver);
		
		Explicit_wait(BS_Pob.Search_txtbox, 30);
		BS_Pob.EnterSearchitem(Search_Item);
		
		Explicit_wait(BS_Pob.Valid_msg, 30);
		String Output = BS_Pob.getValidSearchmsg();
		
		String Actual_Result = Output.replace(" products", "");
		
		if(Actual_Result.equals(Exp_Result))
		{
			Log.info("Passed as Actual Result is " +Actual_Result + "Expected Result is " +Exp_Result);
			
		}
		else
		{
			Log.info("Failed as Actual Result is " +Actual_Result + "Expected Result is " +Exp_Result);
			Capture_Screenshot(TC_ID, Order_Set);
			sAssert.fail("Failed as Actual Result is " +Actual_Result + "Expected Result is " +Exp_Result);
			
		}
		
		
		Stop_Server();
		sAssert.assertAll();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
