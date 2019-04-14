package mercury.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mercury.pages.RegisterPage;
import mercury.testbase.TestBase;
import mercury.utility.ExcelUtil;

public class RegisterTest extends TestBase{
	
	Logger log = Logger.getLogger(TestCls.class);
	
	@DataProvider(name="registerData")
	public Object[][] dataProviderMethod() throws IOException {
		
		Object[][] data = new ExcelUtil().getExcelData(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData.xlsx", "RegisterData");
		
		return data;
	}
	
	@Test(dataProvider="registerData")
	public void registerTest(String firstName,String lastName,String phoneNo,String email,
			String userName, String password,String confirmPswd) {
		log.info("---Register Test Started---");
		ExtentTest test = extent.createTest("Register Test");
		RegisterPage.register(driver,test,firstName, lastName, phoneNo, email,
				 userName,  password, confirmPswd);
		log.info("---Register Test Completed---");
		test.log(Status.INFO,"---Register Test Completed---");
	}
}
