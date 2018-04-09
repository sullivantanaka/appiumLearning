package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class verifyHotelsPage {
	
	WebDriver driver = new FirefoxDriver();
	
	String baseUrl = "https://www.phptravels.net";
	
	topNavBar topNavBar = new topNavBar(driver);
	hotelsPage hotelsPage = new hotelsPage(driver);
	
	@BeforeTest
	public void setUp() throws Exception {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Fim do Teste");
		driver.quit();
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Ignore
@Test //este teste valida a exibição do mapa
	public void verifyMap() {
		topNavBar.clickHotelButton();
		hotelsPage.clickViewMapBtn();
		//assertTrue(hotelsPage.mapVisible());  //TO-DO: encontrar método na classe TestNG
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Ignore
@Test //este teste valida que os valores de checkin = hoje e checkout = amanhã
	public void verifyFilterbyDefaultDate() {
		
		//obtendo as datas de hoje e amanhã
			// converter date para calendar
	        Calendar c = Calendar.getInstance();
	        c.getTime();
	        
	        Date tempToday = c.getTime();
	
	        // somar um dia
	        c.add(Calendar.DATE, 1);	
	        
	        //criando formatador de data de acordo com a aplicação
	        Date tempTomorrow = c.getTime();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        
	        String today    = formatter.format(tempToday);
	        String tomorrow = formatter.format(tempTomorrow);
		
		//iniciando a navegação
        topNavBar.clickHotelButton();
		hotelsPage.clickModifyFilterBtn();
		
		//obtendo as datas default exibidas na tela
		String checkinDate  = hotelsPage.getCheckinDate();
		String checkoutDate = hotelsPage.getCheckoutDate();
		
		//fazendo as asserções
		Assert.assertEquals(today   , checkinDate);
		Assert.assertEquals(tomorrow, checkoutDate);		
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Ignore	@Test //este teste valida o filtro por datas Checkin e Checkout somente
	public void verifyFilterByDate() {
		topNavBar.clickHotelButton();
		hotelsPage.clickModifyFilterBtn();
		hotelsPage.fillCheckin("01/04/2018");
		hotelsPage.fillCheckout("10/04/2018");
		hotelsPage.clickSearchBtn();
		//concluir verificacoes aqui depois
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
	@Test //este teste verifica o filtro de hotéis por estrelas
	public void filterSearchByStarRating() {
		topNavBar.clickHotelButton();
		hotelsPage.selectOneStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectTwoStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectThreeStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectFourStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectFiveStarRating();
		hotelsPage.clickFilterSearchBtn();
	}
	
	
} //verifyHotelsPage
