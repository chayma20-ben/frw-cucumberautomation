package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStep_definition {

	private AuthenticationPage autenticationPage;

	public AuthenticationStep_definition() {
		this.autenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		autenticationPage.goToURL();
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String name) {
		autenticationPage.fillUserName(name);
	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		autenticationPage.fillPassword(password);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		autenticationPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);

	}

}
