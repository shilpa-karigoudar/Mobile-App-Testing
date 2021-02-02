import java.util.Map;

import org.testng.annotations.Test;

public class driver_add {

	


		@Test(dataProvider="dp_add",dataProviderClass=DataProvider_add.class)
		public void testAdd(Map<String,String> add){
			
			String s1 = add.get("s1");
			String s2 = add.get("s2");
			
			String res = add.get("res");
			
			double num1 = Double.parseDouble(s1);
			double num2 = Double.parseDouble(s2);
			
			double Exp_Res = Double.parseDouble(res);
			Double Actual_Res=num1+num2;
			
			if(Actual_Res.equals(Exp_Res)){

				System.out.println("Pass");
			}
			else
				System.out.println("Fail");
	}

}
