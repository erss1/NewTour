package mercury.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mercury.pages.LoginPage;
import mercury.testbase.TestBase;

public class confirmationTest extends TestBase {

	
	@Test
	public void confirmDetails() {
		LoginPage.login(driver,"mercury","mercury");
		driver.findElement(By.xpath("//input[contains(@name,'findFlights')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'reserveFlights')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'buyFlights')]")).click();
		WebElement departing = driver.findElement(By.xpath("(//font[contains(@face,'Arial, Helvetica, sans-serif, Verdana')])[2]"));
		String str2 = departing.getText();
	
			System.out.print("Depart details are correct");
		}
	}



