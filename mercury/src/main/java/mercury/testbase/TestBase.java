package mercury.testbase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	
	
	@BeforeSuite
	public void startup() {
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DOMConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\log4j1.xml");
    	extentReport();
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		extent.flush();
	}
//	
	public static void extentReport() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\extentReport\\TestResult.html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
//	public static void continueButton() {
//		driver.findElement(By.xpath("//input[contains(@name,'findFlights')]")).click();
//		driver.findElement(By.xpath("//input[contains(@name,'reserveFlights')]")).click();
//		
//		
//	}

}
