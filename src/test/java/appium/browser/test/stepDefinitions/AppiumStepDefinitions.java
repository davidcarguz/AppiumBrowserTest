package appium.browser.test.stepDefinitions;

import appium.browser.test.pageObjects.AppiumPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppiumStepDefinitions {

	AppiumPageObjects appiumPageObjects;
	
	@Given("^Ingreso al explorador$")
	public void ingresoAlExplorador() {
	    appiumPageObjects.abrirExplorador();
	}


	@When("^Ingreso a la pagina de Udemy$")
	public void ingresoALaPaginaDeUdemy() {
	    appiumPageObjects.ingresarAUdemy();
	}

	@Then("^Valido ingreso a pagina de Udemy$")
	public void validoIngresoAPaginaDeUdemy() {
	    appiumPageObjects.abrirMenuHamburguesa();
	    appiumPageObjects.ingresarADesarrolloWeb();
	    
	}
}
