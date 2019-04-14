package mercury.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import mercury.pages.LoginPage;
import mercury.testbase.TestBase;
import mercury.utility.ExcelUtil;

public class LoginTest extends TestBase{
	Logger log = Logger.getLogger(LoginTest.class);
	
	@DataProvider(name="loginData")
	public Object[][] dataProviderMethod() throws IOException {
		
		Object[][] data = new ExcelUtil().getExcelData(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData.xlsx", "MercuryLoginData");
		
		return data;
	}
	
	
	@Test(dataProvider="loginData")
	public void validLoginTest(String userName,String password) {
	
		ExtentTest test = extent.createTest("Login Test");
		
		  LoginPage.login(driver,userName,password);
		  
		  driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]")).click();
		 
		
		
	}
	
	

}
