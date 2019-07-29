package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class HomePage extends BasePage {
	
	public void clicarBotaoSigIn(String browser) {
		super.clicar(By.cssSelector(".login"), browser);
	}
	
	public void linkTshirts(String browser) {
		super.clicar(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[last()]/a"), browser);
	}
	
	

}
