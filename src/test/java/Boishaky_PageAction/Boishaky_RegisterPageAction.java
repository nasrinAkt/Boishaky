package Boishaky_PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import Boishaky_PageLocator.Boishaky_RegisterPageLocator;
import Boishaky_utility.Boishaky_Base;
import Boishaky_utility.Boishaky_TestData;
import Boishaky_utility.Boishaky_Utility;

public class Boishaky_RegisterPageAction extends Boishaky_Base{
	
	Boishaky_RegisterPageLocator boishaky_RegisterPageLocator = new Boishaky_RegisterPageLocator();
	
public void enterfirstNameenterLastNameboisemailenterpasswordandclickcreateaccount() throws Exception {
	Thread.sleep(5000);
	 boishaky_RegisterPageLocator.boisFN.sendKeys(Boishaky_TestData .boisFirstName);
	 Thread.sleep(2000);
	 boishaky_RegisterPageLocator.boisLN.sendKeys(Boishaky_TestData.boisLastName);
	 Thread.sleep(2000);
	 boishaky_RegisterPageLocator.boisEA.sendKeys(Boishaky_TestData.boisEmail);
	 Thread.sleep(2000);
	 boishaky_RegisterPageLocator.boisPW.sendKeys(Boishaky_TestData.boisPassword);
	 Thread.sleep(2000);
	 
	 Actions ac = new Actions(driver);
	 ac.moveToElement(boishaky_RegisterPageLocator.scrolldown);
	 ac.perform();
	 
	 
	 boishaky_RegisterPageLocator.clCB.click();
	 Thread.sleep(5000);
	 boishaky_RegisterPageLocator.clCB.click();
	 
	 boishaky_RegisterPageLocator.boisCA.click();
	 Boishaky_Utility.takeMyScreenshot(driver, "register page");
	}
	
	
	
}
