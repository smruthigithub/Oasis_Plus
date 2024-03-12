package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.IDsPage;
import pages.InsurancePage;
import pages.RegistrationPage;

public class IDs_Test extends BaseTest {

	@Test
	public void ID_TC3() throws InterruptedException {
		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		idobj = new IDsPage(driver);
		loginobj.enterUsername("test_6");
		loginobj.enterPassword("test_6");
		loginobj.clickonLogin();
		loginobj.clickonAlert();
		regobj.clickonHamburgerMenu();
		regobj.clickonPMIndex();
		 
		regobj.clickonPMIProcess();
		regobj.clickOnPatientSearch();
		
		regobj.clickonRegistration();
				
		regobj.enterFirstName("Anjum");

		regobj.enterFamilyName("Shaik");
		regobj.clickonGender();
		regobj.enterDOB("20-03-2012");

		idobj.selectIDType();
		Thread.sleep(2000);
		idobj.enterDocNumber("OS-123");
		idobj.enterIssuedDateofID("20-11-2015");
		idobj.enterExpiryDateofID("20-11-2030");
		idobj.clickonDefaultCheckbox();
		Thread.sleep(2000);
		idobj.clickonAddIDbutton();

		insureobj.clickonSaveButton();
	}
	
	

}
