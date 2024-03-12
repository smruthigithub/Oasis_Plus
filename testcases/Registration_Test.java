package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegistrationPage;

public class Registration_Test extends BaseTest {
	
	@Test
	public void registration_TC1() throws InterruptedException {
		
		regobj = new RegistrationPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		loginobj.enterUsername("test_6");
		loginobj.enterPassword("test_6");
		loginobj.clickonLogin();
		loginobj.clickonAlert();
		regobj.clickonHamburgerMenu();
		Thread.sleep(3000);
		regobj.clickonPMIndex();
		regobj.clickonPMIProcess();
		regobj.clickOnPatientSearch();
		regobj.clickonRegistration();
		regobj.titleDropdown();
		regobj.enterFirstName("Aamira");
		regobj.enterFamilyName("Khann");
		regobj.clickonGender();
		regobj.enterDOB("01-01-1992");
		regobj.clickNationalityMenu();
		regobj.enterNationalityName("Indian");
		regobj.clickNationalitySearch();
		regobj.clickOnOkay();
		regobj.clickJobMenu();
		regobj.enterJobSearch("AMBULANCE DRIVER");
		regobj.clickJobSearch();
		regobj.clickJobOkay();
		regobj.enterMobilenumber("0512345678");
		regobj.clickSave();
	}

}
