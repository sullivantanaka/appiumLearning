package Tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Setup.androidSetup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo extends androidSetup {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void visitHomePage() throws MalformedURLException {
		driver = androidSetup.openBrowser("https://www.phptravels.net", "Android Device");
		System.out.println("Fim do teste");
		driver.quit();
	}
	
}
