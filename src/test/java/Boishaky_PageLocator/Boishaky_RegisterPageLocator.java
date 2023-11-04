package Boishaky_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishaky_utility.Boishaky_Base;

public class Boishaky_RegisterPageLocator extends Boishaky_Base {
public Boishaky_RegisterPageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(id="FirstName")
	public WebElement boisFN;
	
	@FindBy(id="LastName")
	public WebElement boisLN;
	
	@FindBy(id="EmailAddress")
	public WebElement boisEA;
	
	@FindBy(id="userPwd_UserInputSecret")
	public WebElement boisPW;
	
	@FindBy(id="btnCancel")
	public WebElement scrolldown;
	
	@FindBy(name ="DellAdvantageCheckbox")
	public WebElement clCB;
	
	@FindBy(id="btnCreateAccount")
	public WebElement boisCA;
	
	
	
}
