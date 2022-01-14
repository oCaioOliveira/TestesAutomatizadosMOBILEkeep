package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static utils.Utils.*;

public class TelaInicialPage {

	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement botaoGetStarted;
	
	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
	private MobileElement botaoNewNote;

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitle;

	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNota;

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoMenu;

	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement> menus;
	
	@AndroidFindBy(id = "com.google.android.keep:id/settings_add_new_items_to_bottom")
	private MobileElement botaoSwitch;
	
	@AndroidFindBy(id = "com.google.android.keep:id/browse_note_interior_content")
	private MobileElement notaCriada;
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement botaoOpcoes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Delete']")
	private MobileElement botaoDelete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Scroll']")
	private MobileElement notaScroll;
	
	public void acionarBotaoGetStarted() {
		botaoGetStarted.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void acionarBotaoNewNote() {
		botaoNewNote.click();
	}

	public void acionarCampoTitle(String title) {
		campoTitle.click();
		campoTitle.clear();
		campoTitle.sendKeys(title);
	}

	public void acionarCampoNota(String note) {
		campoNota.click();
		campoNota.clear();
		campoNota.sendKeys(note);
	}

	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}

	public void acionarBotaoMenu() {
		botaoMenu.click();
	}
	
	public void acionarBotaoSettings() {
		menus.get(6).click();
	}
	
	public void acionarBotaoSwitch() {
		botaoSwitch.click();
	}
	
	public void acionarNotaCriada() {
		notaCriada.click();
	}
	
	public void segurarNotaCriada() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(notaCriada).perform();
	}
	
	public void acionarBotaoOpcoes() {
		botaoOpcoes.click();
	}
	
	public void acionarBotaoDelete() {
		botaoDelete.click();
	}
	
	public void scrollTeste() throws InterruptedException {
		notaScroll.click();
		Thread.sleep(2000);
	}
	
}
