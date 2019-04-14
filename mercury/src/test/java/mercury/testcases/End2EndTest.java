package mercury.testcases;

import org.testng.annotations.Test;

import mercury.pages.BookAFlightPage;
import mercury.testbase.TestBase;

public class End2EndTest extends TestBase {
	
	
	@Test
	public void test() {
		BookAFlightPage test1 = new BookAFlightPage();
		test1.Loginandcredentials("mercury", "mercury");
	}
	
//	
//	@Test
//	public static void passengerandcarddetails(String FirstName, String LastName,int meal, int cardtype , 
//			String Number, int monthExpire, int yearExpire, String Nameoncard,String Midnameoncard,String lastnameoncard){
//		
//		BookAFlightPage.passengerandcarddetails("Smily", "Sood", 5, 5,"5858685", 5, 5, "Smily", "Smile", "Sood");
//		
//	}
	

}
