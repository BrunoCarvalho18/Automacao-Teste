package br.com.pages;

import org.openqa.selenium.By;
import br.com.core.BasePage;

public class ShipmentPage extends BasePage {
	
	public void clicaAgreeTerms(String browser) {
		super.clicar(By.cssSelector("#uniform-cgv"), browser);
	}
	
	public void clicaProceedtoCheckout(String browser) {
		super.clicar(By.cssSelector("button[name=\"processCarrier\"]"), browser);
	}

}
