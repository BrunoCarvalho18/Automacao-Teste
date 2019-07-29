package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class PaymentPage extends BasePage{
	
	public void clicaPayBank(String browser) {
		super.clicar(By.cssSelector("a[title=\"Pay by bank wire\"]"), browser);
	}
	
	public void clicaConfirmOrder(String browser) {
		super.clicar(By.cssSelector("#cart_navigation > button[type=\"submit\"]"), browser);
	}
	
	public String ValidarOrdemCompleta(String browser) {
		String texto = super.pegarTextField(By.cssSelector("#center_column > div > p > strong"), browser);
		return texto;
	}

}
