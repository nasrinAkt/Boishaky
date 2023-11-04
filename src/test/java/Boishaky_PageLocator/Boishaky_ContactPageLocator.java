package Boishaky_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishaky_utility.Boishaky_Base;

public class Boishaky_ContactPageLocator extends Boishaky_Base{
        public Boishaky_ContactPageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(linkText="Visit Store Locator")
	public WebElement Visit;
	
	@FindBy(xpath ="//span[text()='Experience Dell at a reseller store near you']")
	public WebElement verify;
}
