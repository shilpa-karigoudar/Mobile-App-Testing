package Scenario_Component;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.Base_class;
import PageObject_Component.PageObject_Cart;
import PageObject_Component.PageObject_Search;

public class Scenario_Cart extends Base_class {
	
	public static Logger Log=Logger.getLogger(Scenario_Cart.class);
	
	@Test(dataProvider="dp_AddCart",dataProviderClass=DataProvider_Component.DataProvider_testdata.class,groups={"smoke"})
	public void testAddCart(Map<String,String> Cart) throws IOException, InterruptedException
	{
		SoftAssert sAssert= new SoftAssert();
		
		String TC_ID = Cart.get("TC_ID");
		String Order_Set = Cart.get("Order_Set");
		String Search_Item = Cart.get("Search_Item");
		String Exp_Result = Cart.get("Exp_Result");
		
		Start_Server();
		Launch_App();
		
		Log.info("Executing the Testcase " +TC_ID + "  Order set is "+Order_Set);
		
		PageObject_Search BS_Pob= new PageObject_Search(driver);
		
		Explicit_wait(BS_Pob.Search_txtbox, 30);
		BS_Pob.EnterSearchitem(Search_Item);
		
		PageObject_Cart BC_Pob= new PageObject_Cart(driver);
		
		Explicit_wait(BC_Pob.Add_btn, 30);
		BC_Pob.Click_Addbtn();
		
		Explicit_wait(BC_Pob.Cart_img, 30);
		BC_Pob.Click_Img();
		
		
		Explicit_wait(BC_Pob.Validitem_msg, 30);
		String Actual_Result = BC_Pob.getValidCartmsg();
		
		if(Actual_Result.equals(Exp_Result))
		{
			Log.info("Passed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
			
		}
		else
		{
			Log.info("Failed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
			Capture_Screenshot(TC_ID, Order_Set);
			sAssert.fail("Failed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
		}
		
		
		Stop_Server();
		sAssert.assertAll();
		
	}
	
	@Test(dataProvider="dp_DeleteCart",dataProviderClass=DataProvider_Component.DataProvider_testdata.class,groups={"regression"})
	public void testDeleteCart(Map<String,String> Cart) throws IOException, InterruptedException
	{
		SoftAssert sAssert= new SoftAssert();
		
		String TC_ID = Cart.get("TC_ID");
		String Order_Set = Cart.get("Order_Set");
		String Search_Item = Cart.get("Search_Item");
		String Exp_Result = Cart.get("Exp_Result");
		
		Start_Server();
		Launch_App();
		
		Log.info("Executing the Testcase " +TC_ID + "  Order set is "+Order_Set);
		
		PageObject_Search BS_Pob= new PageObject_Search(driver);
		
		Explicit_wait(BS_Pob.Search_txtbox, 30);
		BS_Pob.EnterSearchitem(Search_Item);
		
		PageObject_Cart BC_Pob= new PageObject_Cart(driver);
		
		Explicit_wait(BC_Pob.Add_btn, 30);
		BC_Pob.Click_Addbtn();
		
		Explicit_wait(BC_Pob.Cart_img, 30);
		BC_Pob.Click_Img();
		
		
		Explicit_wait(BC_Pob.Validitem_msg, 30);
		BC_Pob.Click_Deletebtn();
		
		Explicit_wait(BC_Pob.Deleteitem_msg, 30);
		String Actual_Result = BC_Pob.getDeleteCartmsg();	
		
		if(Actual_Result.equals(Exp_Result))
		{
			Log.info("Passed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
			
		}
		else
		{
			Log.info("Failed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
			Capture_Screenshot(TC_ID, Order_Set);
			sAssert.fail("Failed as Actual Result  is " +Actual_Result +  "  Expected Result is " +Exp_Result);
		}
		
		
		Stop_Server();
		sAssert.assertAll();
		
	}
	

}
