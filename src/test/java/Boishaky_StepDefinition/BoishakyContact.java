package Boishaky_StepDefinition;

import Boishaky_PageAction.Boishaky_ContactPageAction;
import Boishaky_PageAction.Boishaky_HomePageAction;
import Boishaky_utility.Boishaky_Base;
import cucumber.api.java.en.Then;

public class BoishakyContact extends Boishaky_Base {
	Boishaky_HomePageAction boishaky_HomePageAction = new Boishaky_HomePageAction();
	Boishaky_ContactPageAction boishaky_ContactPageAction = new Boishaky_ContactPageAction();
	
	@Then("^click on bois contactUs$")
	public void click_on_bois_contactUs() throws Throwable {
		boishaky_HomePageAction.clickonboiscontactUs();   
	}

	@Then("^scrolldown and click on visit store locator$")
	public void scrolldown_and_click_on_visit_store_locator() throws Throwable {
		boishaky_ContactPageAction.scrolldownandclickonvisitstorelocator(); 
	}

	@Then("^Verify user can see contact us page display$")
	public void verify_user_can_see_contact_us_page_display() throws Throwable {
		boishaky_ContactPageAction.Verifyusercanseecontactuspagedisplay(); 
	}


}
