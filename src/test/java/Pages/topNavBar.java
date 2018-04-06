/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author tanakasu
 * 
 * 	Esta classe irá armazenar todos os locators da barra superior
 *
 */
public class topNavBar {

	WebDriver driver;
	
	// definindo os locators
	By homeButton    = By.cssSelector("a.navbar-brand:nth-child(1)");
	By hotelButton   = By.cssSelector("li.main-lnk:nth-child(1) > a:nth-child(1)");
	By flightsButton = By.cssSelector("li.main-lnk:nth-child(2) > a:nth-child(1)");
	By toursButton   = By.cssSelector("li.main-lnk:nth-child(3) > a:nth-child(1)");
	By carsButton    = By.cssSelector("li.main-lnk:nth-child(4) > a:nth-child(1)");
	By offersButton  = By.cssSelector("li.main-lnk:nth-child(5) > a:nth-child(1)");
	By visaButton    = By.cssSelector("li.main-lnk:nth-child(6) > a:nth-child(1)");
	By blogButton    = By.cssSelector("li.main-lnk:nth-child(7) > a:nth-child(1)");

	//definindo o construtor
	public topNavBar(WebDriver driver) {
		this.driver = driver;
	}
	
	//definindo os métodos de interação
	public void clickHomeButton() {
		driver.findElement(homeButton).click();
	}

	public void clickHotelButton() {
		driver.findElement(hotelButton).click();
	}

	public void clickFlightsButton() {
		driver.findElement(flightsButton).click();
	}

	public void clickToursButton() {
		driver.findElement(toursButton).click();
	}

	public void clickCarsButton() {
		driver.findElement(carsButton).click();
	}

	public void clickOffersButton() {
		driver.findElement(offersButton).click();
	}
	
	public void clickVisaButton() {
		driver.findElement(visaButton).click();
	}

	public void clickBlogButton() {
		driver.findElement(blogButton).click();
	}


	// declarar demais metodos aqui depois!!!!
	
}
