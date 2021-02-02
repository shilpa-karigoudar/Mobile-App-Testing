package EMI;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class driver_mort extends Base_mort{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver_mort m= new driver_mort();
		m.Start_Server();
		m.Launch_App();
		
		//Interact with mort_c class
		
		Mort_C c1=new Mort_C();
		ExcelReadWrite xl = new ExcelReadWrite("C:\\DXC_Shilpa\\Appium\\Class\\8-Jul-207\\8-Jul-207\\EMI_Data1.xls");
		
		HSSFSheet Sheet1 = xl.Setsheet("Sheet1");
		
		int rowCount= xl.getrowcount(Sheet1);
		
		for(int i=1;i<rowCount;i++){
			
			String Amount = xl.Readvalue(Sheet1, i, "Amount");
			String Interest = xl.Readvalue(Sheet1, i, "Interest");
			String Tenure = xl.Readvalue(Sheet1, i, "Tenure");
			
			String Expected_Result = xl.Readvalue(Sheet1, i, "Expected_Result");
			
			String Actual_Result = c1.EMI_calc(Amount, Tenure, Interest);
			
			xl.writecell(Sheet1, i, "Actual_Result", Actual_Result);
			
			
			
			if(Expected_Result.equals(Actual_Result)){
				xl.writecell(Sheet1, i, "Status", "Pass");
			}
			else
				xl.writecell(Sheet1, i, "Status", "Fail");
			
		}// end of for loop
		
		xl.save_excel("C:\\DXC_Shilpa\\Appium\\Class\\8-Jul-207\\8-Jul-207\\EMI_Data1.xls");
		
		
	}

}
