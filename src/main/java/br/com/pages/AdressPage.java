package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class AdressPage extends BasePage {
	
	public void clicaAdressCheckout(String browser) {
		super.clicar(By.cssSelector("button[name=\"processAddress\"]"), browser);
	}


}
