package EMI;

public class Mort_C extends Base_mort{

	public String EMI_calc(String Amount,String Tenure,String Interest ) throws InterruptedException
	{
		driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys(Amount);
		driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys(Tenure);
		driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys(Interest);
		
		
		driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
		
		Thread.sleep(3000);	
		
		String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
		//System.out.println("Output is "+Output);
		
		String Result = Output.replace("$", "");
		//System.out.println("Actual Result is "+Actual_Result);
		return Result;
		
		
		
	}
}
