package mercury.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import mercury.utility.SeleniumUtil;

public class FlightFinderPage {
	public static  WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	static Logger log = Logger.getLogger(BookAFlightPage.class);

	public void flightfinder(int passengers, int departingfrom, int onmonth,int onyear, int arrivingin, 
			int returningmonth, int returningyear,int airline) throws IOException {
Properties obj = new Properties();
FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\FLIGHTFINDER.properties");
obj.load(objfile);
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("roundtrip"))), test, "Roundtrip");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("oneway"))), test, "oneway");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("passenger"))), test, passengers, "passenger");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("departingfrom"))), test, departingfrom, "departingfrom");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("onmonth"))), test, onmonth, "onmonth");	
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("onyear"))), test, onyear, "onyear");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("arrivingin"))), test, arrivingin, "arrivingin");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("returningmonth"))), test, returningmonth, "returningmonth");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("returningyear"))), test, returningyear, "returningyear");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("economyclass"))), test, "economyclass");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("businessclass"))), test, "businessclass");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("firstclass"))), test, "firstclass");
SeleniumUtil.dropdown(driver.findElement(By.xpath(obj.getProperty("airline"))), test, airline, "airline");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("continue"))), test, "continue");


		
	}
}
