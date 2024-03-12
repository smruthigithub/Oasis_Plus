package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.IDsPage;
import pages.InsurancePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class BaseTest {
	
	protected WebDriver driver;
	public RegistrationPage regobj;
	public LoginPage loginobj;
	public InsurancePage insureobj;
	public IDsPage idobj;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		loginobj = new LoginPage(driver);
		driver.get("https://testplus.oasisapp.services/dhbhp/faces/Login.jsf");
	}

	
	/*
	 * @BeforeClass public void navigateOasis() {
	 * driver.get("https://testplus.oasisapp.services/dhbhp/faces/Login.jsf");
	 * 
	 * }
	 */
	 

	/*
	 * @AfterClass public void closeBrowser() { driver.close(); }
	 */

}
