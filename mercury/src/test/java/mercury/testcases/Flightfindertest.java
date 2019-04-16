package mercury.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import mercury.pages.FlightFinderPage;
import mercury.pages.LoginPage;
import mercury.testbase.TestBase;
import mercury.utility.ExcelUtil;

public class Flightfindertest extends TestBase {
	
	Logger log = Logger.getLogger(LoginTest.class);
	
	@DataProvider(name="loginData")
public Object[][] databyexcel() throws Exception{
Object[][] data = new ExcelUtil().getExcelData(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData.xlsx", "FlightData");
return data;
		
	}
	
	@Test(dataProvider="loginData")
public void flightfinder(String passengers, String departingfrom, String onmonth,String onyear, String arrivingin, 
		String returningmonth, String returningyear,String airline) throws Exception {
		ExtentTest test = extent.createTest("Flightfindertest");
		
	LoginPage.login(driver,"mercury","mercury");
		  
	Thread.sleep(2000);
	FlightFinderPage.flightfinder(driver,test,passengers, departingfrom, onmonth, onyear, 
	arrivingin, returningmonth, returningyear, airline);
	
	}
}
