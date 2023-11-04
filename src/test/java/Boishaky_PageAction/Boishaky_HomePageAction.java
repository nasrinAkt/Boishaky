package Boishaky_PageAction;


import org.openqa.selenium.interactions.Actions;

import Boishaky_PageLocator.Boishaky_HomePageLocator;
import Boishaky_utility.Boishaky_Base;
import Boishaky_utility.Boishaky_Utility;

public class Boishaky_HomePageAction extends Boishaky_Base{

	Boishaky_HomePageLocator boishaky_HomePageLocator = new Boishaky_HomePageLocator();
	
	public void mousehoveronboissignin() throws Exception {
		 
		Actions act = new Actions(driver);
		act.moveToElement(boishaky_HomePageLocator.mouseonSign).build().perform();
		Boishaky_Utility.takeMyScreenshot(driver, "homepage");
	}
	public void clickboiscreateanaccount() throws Exception {
		Thread.sleep(2000);
		
		boishaky_HomePageLocator.boisCreate.click();
			
	}
	public void clickonboiscontactUs() {
		boishaky_HomePageLocator.clickContact.click();
		
	}
	
	public void Verifyusercanscrolldown() throws Exception {
	Actions ac	= new Actions(driver);
	ac.moveToElement(boishaky_HomePageLocator.scroll);
	ac.perform();
	Thread.sleep(5000);
		
	}
}
