package mercury.pages;

import java.io.FileInputStream;
import java.util.Properties;

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
	//i need to merge all the method in a single me
			
	// This method is for extent report and this optional when we merge the code for END to END test
	public static  void extentReport() {
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\extentReport\\Test.html");
		
	extent = new ExtentReports();
   	extent.attachReporter(htmlReporter);
	}
	   	
	//This method has all the details of PASSENGER and CREDIT CARD
	public static void passengerandcarddetails(WebDriver driver, ExtentTest test,String FirstName, 
	String LastName,String meal, String cardtype ,String Number, String monthExpire, String yearExpire,
	String Nameoncard,String Midnameoncard,String lastnameoncard,String Address1stline,String Address2ndline, 
	String city, String state, String postalcode, String country, String deladd1 ,String deladd2,String delcity,
	String delstate, String delpostal,String delcountry) throws Exception {
	Properties book = new Properties();
	FileInputStream flight =new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//pageObjects//BookAFlight.properties");
	book.load(flight);
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("FirstName"))), test,FirstName,"FirstName");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("LastName"))),test, LastName,"LastName");
	SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("Meal"))),meal,test,"meal");
	SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("CardType"))),cardtype,test,"Cardtype");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Number"))),test,"Number",Number);
	SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("Expiration1"))), monthExpire,test,"expired month");
	SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("Expiration2"))),yearExpire,test,"expired year");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("CardFirstName"))),test,"Smily",Nameoncard);
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("CardMiddleName"))),test,"Smile", Midnameoncard);
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("CardLastName"))),test,"Sood", lastnameoncard);
	SeleniumUtil.click(driver.findElement(By.xpath(book.getProperty("TicketlessTravel"))),test,"Ticketless");
	
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("Address1"))),test,"Address1");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Address1"))),test, Address1stline,"Address1stline");
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("Address2"))),test,"Address2");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Address2"))),test,Address2ndline,"Address2ndline");
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("City"))),test,"city");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("City"))),test, city,"city");
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("StateProvince"))),test,"state");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("StateProvince"))),test, state,"state");
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("PostalCode"))),test,"ZipCode");
	SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("PostalCode"))),test, postalcode,"ZipCode");
	SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("Country"))),country,test, "Country");
	SeleniumUtil.click(driver.findElement(By.xpath(book.getProperty("SameBillingAddress"))),test,"sameasbillingadd");
	SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("Address1del"))),test,"delAddress");
    SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Address1del"))),test,deladd1,"delAddress");
    SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Address2del"))),test,deladd2,"delAddress2");
    SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("Citydel"))),test,"city");
    SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Citydel"))),test,delcity,"delcity");
    SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("State"))),test,"delState");
    SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("State"))),test,delstate,"delState");
    SeleniumUtil.clear(driver.findElement(By.xpath(book.getProperty("Postal"))),test,"Zipcode");
    SeleniumUtil.senkeys(driver.findElement(By.xpath(book.getProperty("Postal"))),test, delpostal,"Zipcode");
  
    SeleniumUtil.dropdown(driver.findElement(By.xpath(book.getProperty("Countrydel"))), delcountry,test,"delcountry");
    Thread.sleep(1000);
    driver.switchTo().alert().accept();
	SeleniumUtil.click(driver.findElement(By.xpath(book.getProperty("buyflight"))),test,"buyFlight");
	
}
		
}
