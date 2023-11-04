package Boishaky_StepDefinition;

import Boishaky_PageAction.Boishaky_HomePageAction;
import Boishaky_utility.Boishaky_Base;
import cucumber.api.java.en.Then;

public class BoishakyScrollDown extends Boishaky_Base {
	Boishaky_HomePageAction  boishaky_HomePageAction  = new Boishaky_HomePageAction ();
	
	@Then("^Verify user can scroll down$")
	public void verify_user_can_scroll_down() throws Throwable {
		boishaky_HomePageAction.Verifyusercanscrolldown(); 
	}

}
