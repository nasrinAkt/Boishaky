package Boishaky_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishaky_utility.Boishaky_Base;

public class Boishaky_HomePageLocator extends Boishaky_Base{

	public Boishaky_HomePageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath = "//span[text()='Sign In']")
	public WebElement mouseonSign;
	
	@FindBy(xpath="//a[text()=' Create an Account ']")
	public WebElement boisCreate;
	
	
	@FindBy(linkText ="Contact Us")
	public WebElement clickContact;
	
	@FindBy(id="mh-unified-footer")
	public WebElement scroll;
	
}
