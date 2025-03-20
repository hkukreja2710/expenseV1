package Utilities;
import java.io.IOException;
  
public class DataProvider {
	@org.testng.annotations.DataProvider(name="LoginData")
	public String[][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"//testData//testData.xlsx";
		ExcelUtility utility=new ExcelUtility(path);
		int totalrows=utility.getRowCount("Sheet1");
		int totalcols=utility.getCellCount("Sheet1",1);

		
		String logindata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				logindata[i-1][j]=utility.getCellData("Sheet1",i,j);
			}
		}
		return logindata;
		
	}
}
