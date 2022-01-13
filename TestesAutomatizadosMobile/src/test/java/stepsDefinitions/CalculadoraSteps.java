package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;

public class CalculadoraSteps {

	CalculadoraPage calculadora = new CalculadoraPage(driver);

	@Quando("eu digitar o numero {string}")
	public void euDigitarONumero(String string) {
		calculadora.digitar2();
	}

	@Quando("eu acionar a tecla mais")
	public void euAcionarATeclaMais() {
		calculadora.acionarTeclaMais();
	}

	@Entao("a calculadora apresenta o resultado {string}")
	public void aCalculadoraApresentaOResultado(String string) {
//	    assertEquals("4", driver.findElementById("com.android.calculator2:id/result"));
	}

}
