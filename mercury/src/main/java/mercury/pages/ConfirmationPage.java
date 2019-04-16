package mercury.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import mercury.utility.SeleniumUtil;

public class ConfirmationPage {

	public static void confirmationpage(WebDriver driver,ExtentTest test) throws Exception {
		Properties obj = new Properties();
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//pageObjects//Confirmation.properties");
obj.load(fis);
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("backtoflights"))), test, "backtoflights");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("backtohome"))), test, "backtohome");
SeleniumUtil.click(driver.findElement(By.xpath(obj.getProperty("logout"))), test, "logout");
	}
}
