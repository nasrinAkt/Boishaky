package Boishaky_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Boishaky_PageLocator.Boishaky_ContactPageLocator;
import Boishaky_utility.Boishaky_Base;
import Boishaky_utility.Boishaky_Utility;

public class Boishaky_ContactPageAction extends Boishaky_Base {

	Boishaky_ContactPageLocator boishaky_ContactPageLocator =new Boishaky_ContactPageLocator();
	
	public void scrolldownandclickonvisitstorelocator() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,900)");
		Thread.sleep(5000);
		boishaky_ContactPageLocator.Visit.click();
		
		
	}
	public void Verifyusercanseecontactuspagedisplay() throws Exception {
		
		Thread.sleep(3000);
		boolean display = boishaky_ContactPageLocator.verify.isDisplayed();
		Assert.assertTrue(display);
		Boishaky_Utility.takeMyScreenshot(driver, "contact page");
	}
}
