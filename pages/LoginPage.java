package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;	
	}
	
	By uName = By.id("it1::content");
	By pswd = By.id("it2::content");
	By lgnBtn = By.id("login");
	By alert = By.xpath("//span[contains(text(), 'Yes')]");
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	public void clickonLogin() {
		driver.findElement(lgnBtn).click();
	}
	
	public void clickonAlert() {
		driver.findElement(alert).click();
	}

}
