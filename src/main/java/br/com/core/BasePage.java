package br.com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void clicar(By by, String browser) {
		DriverFactory.Driver(browser).findElement(by).click();
	}

	public void clicar(String id, String browser) {
		this.clicar(By.id(id), browser);
	}

	public void escrever(By by, String escrever, String browser) {
		DriverFactory.Driver(browser).findElement(by).sendKeys(escrever);
	}

	public void escrever(String id, String escrever, String browser) {
		this.escrever(By.id(id), escrever, browser);
	}

	public String pegarTextField(By by, String browser) {
		return DriverFactory.Driver(browser).findElement(by).getText();
	}

	public String pegarTextField(String id, String browser) {
		return this.pegarTextField(By.id(id), browser);
	}

	public void enviarField(By by, String browser) {
		DriverFactory.Driver(browser).findElement(by).submit();
	}

	public void enviarField(String id, String browser) {
		this.enviarField(By.id(id), browser);
	}

	public void verificaElementoPresente(By by, String browser) {
		DriverFactory.Driver(browser).findElement(by).isDisplayed();
	}

	public void verificaElementoPresente(String id, String browser) {
		this.verificaElementoPresente(By.id(id), browser);
	}

	public void selecionaCampo(By by, String browser, int index) {
		Select select = new Select(DriverFactory.Driver(browser).findElement(by));
		select.selectByIndex(index);
	}
	
	public void selecionaCampo(String id, String browser, int index) {
		this.selecionaCampo(By.id(id), browser, index);
		
	}
	
	public void passaMousePorCima(By by, String browser) {
		Actions acao = new Actions(DriverFactory.Driver(browser));
		acao.moveToElement(DriverFactory.Driver(browser).findElement(by)).build().perform();;
	}

}
