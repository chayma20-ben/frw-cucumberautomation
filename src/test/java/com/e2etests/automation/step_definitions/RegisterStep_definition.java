package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep_definition {

	private RegisterPage registerPage;

	public RegisterStep_definition() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte sur le site Mercury1")
	public void jeMeConnecteSurLeSiteMercury() {
		registerPage.goToURL();
	}

	@When("Je saisis le firstname {string}")
	public void jeSaisisLefirstname(String first) {
		registerPage.fillfirstName(first);
	}

	@When("Je saisis le lastname {string}")
	public void jeSaisisLelastname(String last) {
		registerPage.filllastName(last);
	}

	
	@Then("je saisis  vers le phone {string}")
	public void jeSaisisLephone(String number) {
		registerPage.fillphone(number);

	}

}
