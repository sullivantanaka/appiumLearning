/**
 * 
 */
package Tests;

import com.phpTravel.Pages.topNavBar;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author tanakasu
 *
 * Estes testes verificam a navegação básica dos botões do menu superior
 * 
 */
public class VerifyHomePage {

	String baseUrl = "https://www.phptravels.net";
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@After
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
		topNavBar.clickCarsButton();
		topNavBar.clickOffersButton();
		topNavBar.clickVisaButton();
		topNavBar.clickBlogButton();
		topNavBar.clickHomeButton();
		//topNavBar.
		
	}
	
} //verifyHompePage
