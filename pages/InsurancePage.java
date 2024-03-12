package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class InsurancePage {
	WebDriver driver;
	
	public InsurancePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By purchasersearchfield = By.name("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or4:oc1:ff2:fi23:prchsr_olov:listOfValueTxt");
	By enterpurchaser = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or4:oc1:ff2:fi23:prchsr_olov:listOfValueTxt::content");
	By selectpurchaser = By.xpath("//span[contains(text(),'Policy : Amir-Balsam-Ltd')]");
	By selectamir = By.xpath("//span[contains(text(), 'Amir-Balsam-Ltd')]");
	By clickonokpurchaser = By.xpath("//span[contains(text(),'Ok')]");
	By selectcontract = By.xpath("//span[contains(text(),'INP-AMIR -CLASSA')]");
	By clickokcontract = By.xpath("//span[contains(text(),'Ok')]");
	By clickonAddInsurance = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:ot7:b3']");
	By clickonsavebutton = By.xpath("//span[contains(text(),'Save Changes')]");
	By clickonlogout = By.xpath("//span[contains(text(),'Logout')]");
	
	public void clickonPurchaserfield() {
		driver.findElement(purchasersearchfield).click();
		
	}
	
	public void enterPurchaser(String purchasername) {
		driver.findElement(enterpurchaser).sendKeys(purchasername);
		
	}
		
	public void selectPurchaser() {
		driver.findElement(selectpurchaser).click();		
	}
	
	
	  public void clickonPurchaserName() { 
		  driver.findElement(selectamir).click();
	  }
	
	  public void clickonOkPurchaser() {
	  driver.findElement(clickonokpurchaser).click(); }
	 
	
	public void selectContract() {
		driver.findElement(selectcontract).click();
	}
	
	public void clickonOkContract() {
		driver.findElement(clickokcontract).click();
	}
	
	public void clickonOkAddInsuranceButton() {
		//driver.findElement(clickonAddInsurance).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:ot7:b3")));
		driver.findElement(clickonAddInsurance).click();
		System.out.println("Clicked on 'Add Insurance' button after waiting for modal disappearance.");
	}
	
	public void clickonSaveButton() {
		driver.findElement(clickonsavebutton);			
	}
	
	public void clickonLogout() {
		driver.findElement(clickonlogout);
	}
	
	

}
