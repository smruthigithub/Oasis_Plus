package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.InsurancePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class Insurance_Test extends BaseTest{
	
	@Test
	public void insurance_TC2() throws InterruptedException {

		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		loginobj.enterUsername("test_6");
		loginobj.enterPassword("test_6");
		loginobj.clickonLogin();
		loginobj.clickonAlert();		
		//Assert for Login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Dr.Halah Essa Binladen Hospital')]")));
		System.out.println("User is successfully logged in.");
		regobj.clickonHamburgerMenu();
		Thread.sleep(3000);
		regobj.clickonPMIndex();
		 Thread.sleep(2000);
		regobj.clickonPMIProcess();
		regobj.clickOnPatientSearch();
		
		regobj.clickonRegistration();
				
		regobj.enterFirstName("Anjum");

		regobj.enterFamilyName("Shaik");
		/*
		 * regobj.clickonGender(); Thread.sleep(2000); regobj.enterDOB("20-03-2012");
		 * Thread.sleep(2000);
		 *
		 * //insureobj.clickonSaveButton(); Thread.sleep(2000);
		 */

		insureobj.clickonPurchaserfield();

		insureobj.enterPurchaser("Amir");

		insureobj.selectPurchaser();
		insureobj.selectContract();
		insureobj.clickonOkContract();
		
		insureobj.clickonOkAddInsuranceButton();
		insureobj.clickonSaveButton();
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//span[@class='selected' and text()='Insurance']")));
		 * System.out.println("Insurance tab is selected.");
		 */

	}
	
}
