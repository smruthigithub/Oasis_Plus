package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
		WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By clickonmenu = By.xpath("//a[@id='pt1:OasisHedarToolBar:hamburgerBtn']");
	By searchpatient = By.xpath("//input[@placeholder='Search...']");
	By clickonPMindex = By.xpath("//span[contains(text(),'Patient Master Index')]");
	By clickonPMIprocess = By.xpath("//span[contains(text(),'PMI Processing')]");
	By clickonpatientsearch = By.xpath("(//span[contains(text(),'Patient Search')])[1]");
	By clickonRegister = By.xpath("//span[contains(text(),'Register a New Patient Info')]");
	By clickonfirstname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi32:ptnm1en::content");
	By clickonfamname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi35:nmfmen::content");
	By clickongender = By.xpath("(//span[@class='xk2'])[2]");
	By enterdob = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:ff1:greg_fi:greg_dob::content");
	By clicnationalitymenu = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:oasis_list_of_values_search_btn");
	By enternationalityname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content");
	By clickonnationalitysearch = By.xpath("(//span[contains(text(), 'Search')])[2]");
	By clickonokay = By.xpath("//span[contains(text(), 'Ok')]");
	By clickjobmenu = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:oasis_list_of_values_search_btn");
	By enterjobrole = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content");
	By clickjobsearch = By.xpath("(//span[contains(text(), 'Search')])[3]");
	By clickjobokay = By.xpath("(//span[contains(text(), 'Ok')])[1]");
	By entermobileno = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content");
	By clickonsave = By.xpath("//span[contains(text(), 'Save Changes')]");

	public void clickonHamburgerMenu() {
		driver.findElement(clickonmenu).click();
	}
	
	
	  public void enterpatientsearch() { 
		  driver.findElement(searchpatient).click();
	  }
	
	public void clickonPMIndex() {
		//driver.findElement(clickonPMindex).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Patient Master Index')]")));
	    driver.findElement(By.xpath("//span[contains(text(),'Patient Master Index')]")).click();
	    System.out.println("Clicked on 'Patient Master Index' after waiting for its presence.");
		  }
	
	
	public void clickonPMIProcess() {
		driver.findElement(clickonPMIprocess).click();
	}
	
	public void clickOnPatientSearch() {
		driver.findElement(clickonpatientsearch).click();;
}
	
	public void clickonRegistration() {
		driver.findElement(clickonRegister).click();
	}
	
	public void titleDropdown() {
		WebElement titleDropdownWE = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content"));
		Select title = new Select(titleDropdownWE);
		title.selectByIndex(6);
	}
	
	public void enterFirstName(String fname) {
		driver.findElement(clickonfirstname).sendKeys(fname);
	}
	
	public void enterFamilyName(String famname) {
		driver.findElement(clickonfamname).sendKeys(famname);
	}
	
	public void clickonGender() {
		driver.findElement(clickongender).click();
	}
	
	public void enterDOB(String dob) {
		driver.findElement(enterdob).sendKeys(dob);
	}
	
	public void maritalDropdown() {
		WebElement maritalDropdownWE = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content"));
		Select marital = new Select(maritalDropdownWE);
		marital.selectByVisibleText("Married");
	}
	
	public void clickNationalityMenu() {
		driver.findElement(clicnationalitymenu).click();
	}
	
	public void enterNationalityName(String nationalityname) {
		driver.findElement(enternationalityname).sendKeys(nationalityname);
	}
	
	public void clickNationalitySearch(){
		driver.findElement(clickonnationalitysearch).click();
	}
	
	public void clickOnOkay() {
		driver.findElement(clickonokay).click();
	}
	
	public void clickJobMenu() {
		driver.findElement(clickjobmenu).click();
	}
	
	public void enterJobSearch(String jobsearch) {
		driver.findElement(enterjobrole).sendKeys(jobsearch);
	}
	
	public void clickJobSearch() {
		driver.findElement(clickjobsearch).click();
	}
	
	public void clickJobOkay() {
		driver.findElement(clickjobokay).click();
	}
	
	
	public void enterMobilenumber(String mobileno) {
		driver.findElement(entermobileno).sendKeys(mobileno);
	}
	
	public void clickSave() {
		driver.findElement(clickonsave).click();
	}


}
