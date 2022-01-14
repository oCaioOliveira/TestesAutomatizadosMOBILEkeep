package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static utils.Utils.*;

public class CriarNotaSteps {

	TelaInicialPage telaInicial = new TelaInicialPage(driver);

	@Dado("que eu aciono o botao Get Started")
	public void queEuAcionoOBotaoGetStarted() {
		telaInicial.acionarBotaoGetStarted();
	}

	@Quando("que eu aciono o botao New Note")
	public void queEuAcionoOBotaoNewNote() {
		telaInicial.acionarBotaoNewNote();
	}

	@Quando("eu informar no campo Title {string}")
	public void euInformarNoCampoTitle(String string) {
		telaInicial.acionarCampoTitle(string);
	}

	@Quando("eu informar no campo Note {string}")
	public void euInformarNoCampoNote(String string) {
		telaInicial.acionarCampoNota(string);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
		telaInicial.acionarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String string) {
		assertEquals(string, driver.findElement(By.xpath("//android.widget.TextView[@text = 'Nota1']")).getText());
	}

	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
		telaInicial.acionarBotaoMenu();
	}

	@Quando("eu acionar a aba settings")
	public void euAcionarAAbaSettings() {
		telaInicial.acionarBotaoSettings();
	}

	@Quando("eu tocar no switch")
	public void euTocarNoSwitch() {
		telaInicial.acionarBotaoSwitch();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
		assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom"))
				.getAttribute("checked"));
	}

	@Quando("^eu acionar a nota$")
	public void euAcionarANota() throws Throwable {
		telaInicial.acionarNotaCriada();
	}

	@Quando("eu tocar e segurar a nota")
	public void euTocarESegurarANota() {
		telaInicial.segurarNotaCriada();
	}

	@Quando("eu tocar nas opcoes")
	public void euTocarNasOpcoes() {
		telaInicial.acionarBotaoOpcoes();
	}

	@Quando("eu tocar em deletar")
	public void euTocarEmDeletar() {
		telaInicial.acionarBotaoDelete();
	}

	@Entao("o sistema adiciona a nota na lixeira")
	public void oSistemaAdicionaANotaNaLixeira() {
		assertEquals("Note moved to trash", driver.findElement(By.xpath("//android.widget.TextView[@text = 'Note moved to trash']")).getText());
	}

	@Quando("^eu clicar na scroll teste$")
	public void euClicarNaScrollTeste() throws Throwable {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Scroll\").instance(0))"));
		telaInicial.scrollTeste();
	}

	@Quando("^eu arrastar a nota pra direita$")
	public void euArrastarANotaPraDireita() throws Throwable {
		telaInicial.arrastarNotaDireita();
	}

	@Entao("^o sistema arquiva a nota$")
	public void oSistemaArquivaANota() throws Throwable {
		assertEquals("Note archived", driver.findElement(By.xpath("//android.widget.TextView[@text = 'Note archived']")).getText());
	}

	@Entao("^o aplicativo edita a nota com o titulo \"([^\"]*)\"$")
	public void oAplicativoEditaANotaComOTitulo(String string) throws Throwable {
		assertEquals(string, driver.findElement(By.xpath("//android.widget.TextView[@text = 'NotaEditada']")).getText());
	}
	

}
