import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

public class DataProvider_add {

	

	@DataProvider(name="dp_add")
	public static Iterator<Object[]> getTestData() throws IOException{
		
		ExcelReadWrite xl=new ExcelReadWrite("C:\\DXC_Shilpa\\Appium\\Class\\15-Jul-2017\\15-Jul-2017\\Sum1.xls");
		
		HSSFSheet Sheet1 = xl.Setsheet("Sheet1");	
		
		int rowCount = xl.getrowcount(Sheet1);
		
		System.out.println("RowCount" +rowCount );
		
		int colCount = xl.getcolcount(Sheet1, 0);
		
		System.out.println("ColCount" +colCount);
		
		
		// collect data and put inside the list of Object Array
		
		List<Object[]> arr_list= new ArrayList<Object[]>(); //single dimensional object array as the data provider allowes only object array
		
		for(int i=1;i<rowCount;i++){
		//HashMap map=new HashMap();
			Object[] x=new Object[1];
			
			Map<String,String> dMap = new HashMap<String,String>();
			
			for(int j=0;j<colCount;j++){
				
				String key = xl.Readvalue(Sheet1, 0, j);
				String value = xl.Readvalue(Sheet1, i, j);
				dMap.put(key, value);
			}
			x[0]=dMap;
			
			arr_list.add(x);
			
		
			
		}
		
		return arr_list.iterator();
		
		
	
	}
}
