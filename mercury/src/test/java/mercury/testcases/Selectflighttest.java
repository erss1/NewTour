package mercury.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import mercury.pages.LoginPage;
import mercury.pages.SELECTFLIGHT;
import mercury.testbase.TestBase;

public class Selectflighttest extends TestBase {
	
	Logger log = Logger.getLogger(LoginTest.class);
	
@Test
	public void selectflight() throws Exception {
	ExtentTest test = extent.createTest("Selectflighttest");
	LoginPage.login(driver, "mercury", "mercury");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[contains(@name,'findFlights')]")).click();
	
	SELECTFLIGHT.selectflight(driver,test);
	

}
}
