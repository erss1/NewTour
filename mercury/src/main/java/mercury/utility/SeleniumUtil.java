package mercury.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mercury.pages.BookAFlightPage;

public class SeleniumUtil {
	 static Logger log = Logger.getLogger(BookAFlightPage.class);
	
	public static void senkeys(WebElement element,ExtentTest test,String value,String elementName) {
		
		element.sendKeys(value);
		test.log(Status.INFO,"Value Entered in "+elementName+" successfully");
		log.info("Value Entered in "+elementName+" successfully");
	}
	
	//click
	public static  void click(WebElement element, ExtentTest test,String elementName) {
		element.click();
		test.log(Status.INFO,"Value clicked in "+elementName+" successfully");
		log.info("Value clicked in "+elementName+" successfully");
	}
	
	//dropdown
	
	public static void dropdown(WebElement element,ExtentTest test,int index, String elementName) {
		Select exp = new Select(element);
		exp.selectByIndex(index);
		test.log(Status.INFO,"Value dropped down "+elementName+" successfully");
		log.info("Value dropped down "+elementName+" successfully");
		
	}
	
	public static void dropdown(WebElement element,ExtentTest test,String value, String elementName) {
		Select exp = new Select(element);
		exp.selectByValue(value);
		test.log(Status.INFO,"Value dropped down "+elementName+" successfully");
		log.info("Value dropped down "+elementName+" successfully");
		
	}
	public static void dropdown(WebElement element,String value, ExtentTest test, String elementName) {
		Select exp = new Select(element);
		exp.selectByVisibleText(value);
		test.log(Status.INFO,"Value dropped down "+elementName+" successfully");
		log.info("Value dropped down "+elementName+" successfully");
		
	}
	
	//clear
	
	public static  void clear(WebElement element,ExtentTest test,String elementName) {
		element.clear();
		test.log(Status.INFO,"Value cleared in "+elementName+" successfully");
		log.info("Value cleared in "+elementName+" successfully");
	}
	
	
}
