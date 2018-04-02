package Setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class androidSetup {
	/*
	 *  OpenBrowser
	 *  
	 *  Este método recebe como parâmetros a url que se deseja abrir e o nome do dispositivo android
	 *  
	 */
	public static AndroidDriver<AndroidElement> openBrowser(String url, String deviceName) throws MalformedURLException {
		if (deviceName == "")  {
			deviceName = "Android Device";  //default Real Device or available device
		}

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "deviceName"); //TO-DO: trocar para variável depois
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get(url);
		return driver;		
	}

}
