package mercury.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import mercury.pages.BookAFlightPage;
import mercury.pages.LoginPage;
import mercury.testbase.TestBase;
import mercury.utility.ExcelUtil;
import mercury.utility.SeleniumUtil;

public class BookaflightTest extends TestBase {
	
	Logger log = Logger.getLogger(BookaflightTest.class);
	
	@DataProvider(name="bookflight")
	public Object[][] databyexcel1() throws Exception{
	Object[][] data = new ExcelUtil().getExcelData(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData.xlsx", "Bookaflight");
	return data;
			
		}
	
	@Test(dataProvider="bookflight")
	public void bookaflight(String FirstName, String LastName,String meal, String cardtype , 
	String Number, String monthExpire, String yearExpire, String Nameoncard,String Midnameoncard,
	String lastnameoncard,String Address1stline,String Address2ndline, String city, String state, 
	String postalcode, String country, String deladd1 ,String deladd2,String delcity, String delstate, 
	String delpostal,String delcountry) throws Exception {
		ExtentTest test = extent.createTest("bookaflight");
	LoginPage.login(driver,"mercury","mercury");
	
	SeleniumUtil.click(driver.findElement(By.xpath("//input[contains(@name,'findFlights')]")),test,"continuefrom1stpage");
	SeleniumUtil.click(driver.findElement(By.xpath("//input[contains(@name,'reserveFlights')]")),test,"continuefrom2ndpage");
	
	BookAFlightPage.passengerandcarddetails(driver, test, FirstName, LastName, meal, cardtype, Number, monthExpire,
			yearExpire, Nameoncard, Midnameoncard, lastnameoncard, Address1stline, Address2ndline, city, state, 
			postalcode, country, deladd1, deladd2, delcity, delstate, delpostal, delcountry);
	}
	


}
