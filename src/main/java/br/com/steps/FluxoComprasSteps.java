package br.com.steps;

import org.junit.Assert;
import br.com.core.Utils;
import com.github.javafaker.Faker;
import br.com.core.DriverFactory;
import br.com.pages.AcountCreatePage;
import br.com.pages.AdressPage;
import br.com.pages.AuthenticationPage;
import br.com.pages.HomePage;
import br.com.pages.PaymentPage;
import br.com.pages.ShipmentPage;
import br.com.pages.TShirtPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FluxoComprasSteps {

	String url = "http://automationpractice.com/index.php";
	HomePage home = new HomePage();
	AuthenticationPage autenticacao = new AuthenticationPage();
	AcountCreatePage criarconta = new AcountCreatePage();
	TShirtPage tshirt = new TShirtPage();
	Faker faker = new Faker();
	AdressPage adress = new AdressPage();
	ShipmentPage shipment = new ShipmentPage();
	PaymentPage payment = new PaymentPage();


	@Given("^que eu faça um cadastro de um novo usuário no browser \"([^\"]*)\"$")
	public void que_eu_faça_um_cadastro_de_um_novo_usuário_no_browser(String browser) throws Throwable {
		DriverFactory.Driver(browser).get(url);
		home.clicarBotaoSigIn(browser);
		autenticacao.preencherEmail(faker.internet().emailAddress(), browser);
		autenticacao.criarConta(browser);
		criarconta.selecionaGenero(browser);
		criarconta.preencherFirstName(faker.name().firstName(), browser);
		criarconta.preencherLastName(faker.name().lastName(), browser);
		criarconta.preencherPassword(faker.internet().password(), browser);
		criarconta.selecionaDay(browser, 25);
		criarconta.selecionaMonth(browser, 11);
		criarconta.selecionaYear(browser, 25);
		criarconta.preencherCompany(faker.company().name(), browser);
		criarconta.preencherEndereco(faker.address().streetAddress(), browser);
		criarconta.preencherCity(faker.address().city(), browser);
		criarconta.selecionaState(browser, 10);
		criarconta.preencherZipCode(faker.address().zipCode(), browser);
		criarconta.preencherMobilePhone(faker.phoneNumber().cellPhone(), browser);
		criarconta.clicarBotaoSubmit(browser);
	}

	@When("^eu selecionar um produto no e-commerce no browser \"([^\"]*)\"$")
	public void eu_selecionar_um_produto_no_e_commerce_no_browser(String browser) throws Throwable {
		home.linkTshirts(browser);
		tshirt.passaPorCimaItem(browser);
	}

	@And("^adicionar ao carrinho no browser \"([^\"]*)\"$")
	public void adicionar_ao_carrinho_no_browser(String browser) throws Throwable {
		tshirt.clicaItem(browser);
		tshirt.clicaaddCart(browser);
		tshirt.clicaProceedCheckout(browser);
		tshirt.clicaProcessCheckoutNovamente(browser);
	}

	@And("^preencher as informações necessárias no browser \"([^\"]*)\"$")
	public void preencher_as_informações_necessárias_no_browser(String browser) throws Throwable {
        adress.clicaAdressCheckout(browser);
        shipment.clicaAgreeTerms(browser);
        shipment.clicaProceedtoCheckout(browser);
        payment.clicaPayBank(browser);
        payment.clicaConfirmOrder(browser);
    }

	@Then("^devo visualizar \"([^\"]*)\" no browser \"([^\"]*)\"$")
	public void devo_visualizar_no_browser(String mensagem, String browser) throws Throwable {
		Assert.assertEquals(mensagem, payment.ValidarOrdemCompleta(browser));
		Utils.tiraPrint(browser);
	}
}
