/**
 * 
 */
package Tests;

import Setup.androidSetup;

import Pages.topNavBar;
import Pages.hotelsPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author tanakasu
 *
 * Estes testes verificam a navegação básica dos botões do menu superior
 *
 */
public class VerifyHomePage extends androidSetup {
	AndroidDriver<AndroidElement> driver;
	String baseUrl = "https://www.phptravels.net";

	@BeforeTest
	public void setUp() throws Exception {
		driver = androidSetup.openBrowser(baseUrl,"Android Device");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Fim do Teste");
		//driver.quit();
	}
	
	@Test //este teste verifica todos os botões do menu superior, abrindo cada página
	public void verifyBasicTopBarNavigation() {
		
		topNavBar topNavBar = new topNavBar(driver);
		topNavBar.clickHotelButton();
		topNavBar.clickFlightsButton();
		topNavBar.clickToursButton();
		//topNavBar.clickCarsButton();
		//topNavBar.clickOffersButton();
		//topNavBar.clickVisaButton();
		//topNavBar.clickBlogButton();
		//topNavBar.clickHomeButton();

	}
	
} //verifyHompePage
