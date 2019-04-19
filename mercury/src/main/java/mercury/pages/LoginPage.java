package mercury.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	static Logger log = Logger.getLogger(LoginPage.class);
	public static void login(WebDriver driver,String userName,String password) {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		log.info("User Name Entered");
		//test.log(Status.INFO, "User Name Entered");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		log.info("Password Entered");
		//test.log(Status.INFO, "Password Entered");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		log.info("Clicked on Login Btn");
		//test.log(Status.INFO, "Clicked on Login Btn");// ExtentTest test add this in parameters
	}

}
