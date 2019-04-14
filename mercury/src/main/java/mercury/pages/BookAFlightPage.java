package mercury.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import mercury.utility.SeleniumUtil;

/**
 * This class contains three methods.
 * Loginandcredentials method is mandatory before passengerandcarddetails and bilanddeladd.
 * @author Smily Sood
 */
public class BookAFlightPage  {
	public static  WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	static Logger log = Logger.getLogger(BookAFlightPage.class);
	
		
		
    //This method has login credentials as well as Next page button to enter the BOOK A FLIGHT page
	//i need to merge all the method in a single method
	public void Loginandcredentials(String username,String password) {
	ExtentTest test = extent.createTest("test");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='userName']")),test,"mercury", username);
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='password']")),test,"mercury", password);
	SeleniumUtil.click(driver.findElement(By.xpath("//input[@name='login']")), test,"login");	
	SeleniumUtil.click(driver.findElement(By.xpath("//input[contains(@name,'findFlights')]")),test,"continuefrom1stpage");
	SeleniumUtil.click(driver.findElement(By.xpath("//input[contains(@name,'reserveFlights')]")),test,"continuefrom2ndpage");
		} 
			
	// This method is for extent report and this optional when we merge the code for END to END test
	public static  void extentReport() {
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\extentReport\\Test.html");
		
	extent = new ExtentReports();
   	extent.attachReporter(htmlReporter);
	}
	   	
	//This method has all the details of PASSENGER and CREDIT CARD
	public  void passengerandcarddetails(String FirstName, String LastName,int meal, int cardtype , 
	String Number, int monthExpire, int yearExpire, String Nameoncard,String Midnameoncard,String lastnameoncard) {
	ExtentTest test = extent.createTest("passengerandcarddetails");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='passFirst0']")), test,"FirstName",FirstName);
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='passLast0']")),test,"LastName", LastName);
	SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'pass.0.meal')]")),test,meal, "meal");
	SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'creditCard')]")),test, cardtype,"Cardtype");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='creditnumber']")),test,"Number",Number);
	SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'cc_exp_dt_mn')]")),test, monthExpire,"expired month");
	SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'cc_exp_dt_yr')]")),test,yearExpire,"expired year");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("(//input[contains(@type,'TEXT')])[1]")),test,"Smily",Nameoncard);
	SeleniumUtil.senkeys(driver.findElement(By.xpath("(//input[contains(@type,'TEXT')])[2]")),test,"Smile", Midnameoncard);
	SeleniumUtil.senkeys(driver.findElement(By.xpath("(//input[contains(@type,'TEXT')])[3]")),test,"Sood", lastnameoncard);
	SeleniumUtil.click(driver.findElement(By.xpath("(//input[contains(@name,'ticketLess')])[1]")),test,"Ticketless");
	
	}
    //This is  the second method of BOOKAFLIGHT PAGE. 
	//This method contains all the Information of BILLING ADDRESS and DELIVERY ADDRESS
	public static void bilanddeladd(String Address1stline,String Address2ndline, String city, String state, 
	String postalcode, int country, String deladd1 ,String deladd2,String delcity, String delstate, 
	String delpostal,int delcountry) {
	ExtentTest test = extent.createTest("bilanddeladd");
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'billAddress1')]")),test,"Address1");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'billAddress1')]")),test,"Address1stline", Address1stline);
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'billAddress2')]")),test,"Address2");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'billAddress2')]")),test,"Address2ndline",Address2ndline);
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'billCity')]")),test,"city");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'billCity')]")),test,"city", city);
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'billState')]")),test,"state");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'billState')]")),test,"state", state);
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'billZip')]")),test,"ZipCode");
	SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'billZip')]")),test,"ZipCode", postalcode);
	SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'billCountry')]")),test,country, "country");
	SeleniumUtil.click(driver.findElement(By.xpath("(//input[contains(@name,'ticketLess')])[2]")),test,"sameasbillingadd");
	SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'delAddress1')]")),test,"delAddress");
    SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'delAddress1')]")),test,deladd1,"delAddress");
    SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'delAddress2')]")),test,deladd2,"delAddress2");
    SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'delCity')]")),test,"city");
    SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'delCity')]")),test,delcity,"delcity");
    SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'delState')]")),test,"delState");
    SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'delState')]")),test,delstate,"delState");
    SeleniumUtil.clear(driver.findElement(By.xpath("//input[contains(@name,'delZip')]")),test,"Zipcode");
    SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[contains(@name,'delZip')]")),test,"Zipcode", delpostal);
    SeleniumUtil.dropdown(driver.findElement(By.xpath("//select[contains(@name,'delCountry')]")),test, delcountry,"delcountry");
    driver.switchTo().alert().accept();
	SeleniumUtil.click(driver.findElement(By.xpath("//input[contains(@name,'buyFlights')]")),test,"buyFlight");
	}
		
		
		
}
