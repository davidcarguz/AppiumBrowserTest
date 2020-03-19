package appium.browser.test.pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import net.serenitybdd.core.pages.PageObject;

public class AppiumPageObjects extends PageObject {

	public AppiumDriver<MobileElement> driver;
	public DesiredCapabilities dc = new DesiredCapabilities();
	public WebDriverWait wait;
	public URL server; 
	
	public void abrirExplorador() {
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "d728d2a97cf5");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		try {
			server = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver = new AppiumDriver<>( server,dc);
		wait = new WebDriverWait(driver, 20);
		
	}

	public void ingresarAUdemy() {
		this.driver.get("https://www.udemy.com");
	}

	public void abrirMenuHamburguesa() {
		WebElement hamburguesa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"udemy\"]/div[2]/div[1]/div[2]/div[1]/label[1]")));
		hamburguesa.click();
	}

	public void ingresarADesarrolloWeb() {
		WebElement webDev1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"udemy\"]/div[2]/div[1]/div[3]/nav/div/div/ul[2]/li[1]/label/span")));
		webDev1.click();
		WebElement webDev2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/nav/div/div-l1[2]/div/ul[2]/li[2]/a/span")));
		webDev2.click();
		
	}
	
	
}
