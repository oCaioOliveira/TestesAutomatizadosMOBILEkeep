package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculadoraPage {

	public CalculadoraPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.android.calculator2:id/digit_6")
	private MobileElement tecla6;

	@AndroidFindBy(accessibility = "plus")
	private MobileElement teclaMais;

	public void digitar2() {
		tecla6.click();
	}

	public void acionarTeclaMais() {
		teclaMais.click();
	}

}