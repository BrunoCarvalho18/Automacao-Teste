package br.com.pages;

import org.openqa.selenium.By;
import br.com.core.BasePage;

public class TShirtPage extends BasePage {

	public void passaPorCimaItem(String browser) {
		super.passaMousePorCima(By.cssSelector(".product-container"), browser);
	}

	public void clicaItem(String browser) {
		super.clicar(By.cssSelector("h5 > a[title=\"Faded Short Sleeve T-shirts\"]"), browser);
	}

	public void clicaaddCart(String browser) {
		super.clicar(By.cssSelector("button[name=\"Submit\"]"), browser);
	}

	public void clicaProceedCheckout(String browser) {
		super.clicar(By.cssSelector("a[title=\"Proceed to checkout\"]"), browser);
	}

	public void clicaProcessCheckoutNovamente(String browser) {
		super.clicar(By.xpath("//*[@id=\"center_column\"]/p[last()]/a[child::text()]/span"), browser);
	}

}
