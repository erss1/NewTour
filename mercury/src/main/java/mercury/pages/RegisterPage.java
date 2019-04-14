package mercury.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mercury.utility.SeleniumUtil;


public class RegisterPage {

	static Logger log = Logger.getLogger(RegisterPage.class);
	
	public static void register(WebDriver driver,ExtentTest test, String firstName,String lastName,String phoneNo,String email,
			String userName, String password,String confirmPswd) {
		try {
			
		driver.findElement(By.xpath("//a[contains(.,'REGISTER')]")).click();
		log.info("Clicked on Register Btn");
		test.log(Status.INFO, "Clicked on Register Btn");
		
		SeleniumUtil.senkeys(driver.findElement(By.xpath("//input[@name='firstName']")),test,"firstname", firstName);
				
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		log.info("LastName Entered successfully");
		test.log(Status.INFO,"LastName Entered successfully");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phoneNo);
		log.info("Phone Number Entered successfully");
		test.log(Status.INFO,"Phone Number Entered successfully");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
		log.info("Email Entered successfully");
		test.log(Status.INFO,"Email Entered successfully");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
		log.info("User Name Entered successfully");
		test.log(Status.INFO,"User Name Entered successfully");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		log.info("Password Entered successfully");
		test.log(Status.INFO,"Password Entered successfully");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPswd);
		log.info("Confirm Password Entered successfully");
		test.log(Status.INFO,"Confirm Password Entered successfully");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		log.info("Clicked on Register Btn");
		test.log(Status.INFO,"Clicked on Register Btn");
		}catch(Exception e) {
			log.error("Error in Register Page : "+e);
			test.log(Status.ERROR,"Error in Register Page : "+e);
			
		}
	}
}
