package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseTest{	
	@Test
	public void Login_TC1() {
		loginobj.enterUsername("test_6");
		loginobj.enterPassword("test_6");
		loginobj.clickonLogin();
		loginobj.clickonAlert();
		
	}


}
