package br.com.pages;

import org.openqa.selenium.By;
import br.com.core.BasePage;

public class AcountCreatePage extends BasePage {
	
	public void selecionaGenero(String browser) {
		super.clicar(By.cssSelector("label[for=\"id_gender1\"]"), browser);
	}
	
	public void preencherFirstName(String escrever, String browser) {
		super.escrever(By.cssSelector("#customer_firstname"), escrever, browser);
	}

	public void preencherLastName(String escrever, String browser) {
		super.escrever(By.cssSelector("#customer_lastname"), escrever, browser);
	}
	
	public void preencherPassword(String escrever, String browser) {
		super.escrever(By.cssSelector("#passwd"), escrever, browser);
	}

	public void selecionaDay(String browser, int index) {
		super.selecionaCampo(By.id("days"), browser, index);
	}
	
	public void selecionaMonth(String browser, int index) {
		super.selecionaCampo(By.id("months"), browser, index);
	}
	
	public void selecionaYear(String browser, int index) {
		super.selecionaCampo(By.id("years"), browser, index);
	}
	
	public void preencherCompany(String escrever, String browser) {
		super.escrever(By.cssSelector("#address1"), escrever, browser);
	}
	
	public void preencherEndereco(String escrever, String browser) {
		super.escrever(By.cssSelector("#address1"), escrever, browser);
	}
	
	public void preencherCity(String escrever, String browser) {
		super.escrever(By.cssSelector("#city"), escrever, browser);
	}
	
	public void selecionaState(String browser, int index) {
		super.selecionaCampo(By.id("id_state"), browser, index);
	}
	
	public void preencherZipCode(String escrever, String browser) {
		super.escrever(By.cssSelector("#postcode"), escrever, browser);
	}
	
	public void preencherMobilePhone(String escrever, String browser) {
		super.escrever(By.cssSelector("#phone_mobile"), escrever, browser);
	}
	
	public void clicarBotaoSubmit(String browser) {
	   super.clicar(By.cssSelector("#submitAccount"), browser);	
	}
	
}
