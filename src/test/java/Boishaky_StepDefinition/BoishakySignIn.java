package Boishaky_StepDefinition;

import Boishaky_PageAction.Boishaky_HomePageAction;
import Boishaky_PageAction.Boishaky_RegisterPageAction;
import Boishaky_utility.Boishaky_Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BoishakySignIn extends Boishaky_Base {
	Boishaky_HomePageAction boishaky_HomePageAction = new Boishaky_HomePageAction();
	Boishaky_RegisterPageAction boishaky_RegisterPageAction = new Boishaky_RegisterPageAction();
	
	@Given("^Launch bois <\"([^\"]*)\">$")
	public void launch_bois(String URL) throws Throwable {
		 BoisLaunchURL(URL);
		 
	}

	@Then("^mouse hover on bois sign in$")
	public void mouse_hover_on_bois_sign_in() throws Throwable {
		boishaky_HomePageAction.mousehoveronboissignin();
	}

	@Then("^click bois create an account$")
	public void click_bois_create_an_account() throws Throwable {
		boishaky_HomePageAction.clickboiscreateanaccount();  
	}

	@Then("^enter firstName enter LastName bois email enter password click check box and click create account$")
	public void enter_firstName_enter_LastName_bois_email_enter_password_click_check_box_and_click_create_account() throws Throwable {
		boishaky_RegisterPageAction.enterfirstNameenterLastNameboisemailenterpasswordandclickcreateaccount(); 
	}


	


}
