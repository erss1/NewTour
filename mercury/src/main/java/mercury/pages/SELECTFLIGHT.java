package mercury.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import mercury.utility.SeleniumUtil;

public class SELECTFLIGHT {
	static WebElement driver;
	static ExtentTest test;
	public static void selectflight(WebDriver driver,ExtentTest test) throws Exception {
		
	Properties obj = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//pageObjects//SELECTFLIGHT.properties");
	obj.load(fis);
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("blueskies360"))),test, "BlueSkiesAirline360");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("bluesskies361"))), test, "bluesskies361");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("pangaea362"))), test, "pangaea362");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("unified363"))), test, "unified363");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("blueskies630"))), test, "blueskies630");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("blueskies631"))), test, "blueskies631");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("pangea632"))), test, "pangea632");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("unified633"))), test, "unified633");
	SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("continue"))), test, "continue");
	
	}
	
}
