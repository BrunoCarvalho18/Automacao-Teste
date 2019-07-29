package br.com.pages;

import org.openqa.selenium.By;
import br.com.core.BasePage;

public class AuthenticationPage extends BasePage {
	
	public void preencherEmail(String escrever,String browser) {
		super.escrever(By.cssSelector("#email_create"), escrever, browser);
	}
	
	public void criarConta(String browser) {
		super.clicar(By.cssSelector("#SubmitCreate"), browser);
	}

}
