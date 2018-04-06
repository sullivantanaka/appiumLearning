/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author tanakasu
 *
 * Esta classe armazena os locators da página Hotels
 * 
 */
public class hotelsPage {

	WebDriver driver;
	
	// definindo os locators
	By backBtn           = By.cssSelector("a.icon-angle-left");
	By modifyFilterBtn   = By.cssSelector("div.col-xs-1:nth-child(5) > div:nth-child(1) > a:nth-child(1)");
	By viewMapBtn        = By.cssSelector("#body-section > div.header-mob > div > div > div:nth-child(4) > div > a > i"); //checar depois
	By map               = By.cssSelector("#map > div > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
	By locationField     = By.className("select2-input");
	By checkinField      = By.name("checkin");
	By checkoutField     = By.name("checkout");
	By adultsField       = By.id("adults");     // checar se podemos usar sendKeys
	By childField	     = By.id("child");
	By searchBtn	     = By.cssSelector("#modify > div.container > div > form > div:nth-child(3) > div.bgfade.col-md-12.form-group.go-right.col-xs-12 > button");
	By star1		     = By.cssSelector(".rating > div:nth-child(1) > div:nth-child(1) > ins:nth-child(2)"); //radio-button 1 estrela
	By star2		     = By.cssSelector(".rating > div:nth-child(3) > div:nth-child(1) > ins:nth-child(2)"); //radio-button 2 estrela
	By star3		     = By.cssSelector(".rating > div:nth-child(5) > div:nth-child(1) > ins:nth-child(2)"); //radio-button 3 estrela
	By star4		     = By.cssSelector(".rating > div:nth-child(7) > div:nth-child(1) > ins:nth-child(2)"); //radio-button 4 estrela
	By star5		     = By.cssSelector(".rating > div:nth-child(9) > div:nth-child(1) > ins:nth-child(2)"); //radio-button 5 estrela
	By apartmentUnChecked= By.cssSelector("#collapse3 > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > ins:nth-child(2)");
	By apartmentChecked  = By.cssSelector(".checked > ins:nth-child(2)");
	///
	///
	///
	By filterSearchBtn   = By.id("searchform");
	
	
	//definindo o construtor
	public hotelsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//métodos menu superior
	public void clickBackBtn() {
		driver.findElement(backBtn);
	}
	
	public void clickModifyFilterBtn() {
		driver.findElement(modifyFilterBtn).click();
	}

	public void clickViewMapBtn() {
		driver.findElement(viewMapBtn).click();
	}
	
	public boolean mapVisible() { //retorna true se encontrou e carregou o mapa
		if (driver.findElement(map).isDisplayed()) {
			return true;
		}
		else
			return false;
	}

	public void fillLocation (String location) {
		driver.findElement(locationField).sendKeys(location);		
	}
	
	//métodos para manipulação das datas checkin e checkout
	public void fillCheckin (String checkin) {
		driver.findElement(checkinField).clear();
		driver.findElement(checkinField).sendKeys(checkin);
	}
	
	public void fillCheckout (String checkout) {
		driver.findElement(checkoutField).clear();
		driver.findElement(checkoutField).sendKeys(checkout);
	}
	
	public String getCheckinDate() {
		return driver.findElement(checkinField).getAttribute("value");
	}

	public String getCheckoutDate() {
		return driver.findElement(checkoutField).getAttribute("value");
	}
	
	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	}

	//métodos menu esquerdo
	public void selectOneStarRating() {
		driver.findElement(star1).click();
	}
	
	public void selectTwoStarRating() {
		driver.findElement(star2).click();
	}
	
	public void selectThreeStarRating() {
		driver.findElement(star3).click();
	}
	
	public void selectFourStarRating() {
		driver.findElement(star4).click();
	}
	
	public void selectFiveStarRating() {
		driver.findElement(star5).click();
	}

	//
	//
	//
	//
	
	public void clickFilterSearchBtn() {
		driver.findElement(filterSearchBtn).click();
	}

	

} //hotelsPage
