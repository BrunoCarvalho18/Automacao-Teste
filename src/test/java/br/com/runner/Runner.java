package br.com.runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import br.com.core.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.steps" }, features = {
		"src/main/java/br/com/features/" }, monochrome = true, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, tags = { "~@ignore", "@geral" })

public class Runner {

	@AfterClass
	public static void encerraTeste() {
		DriverFactory.EncerraDriver();
	}

	@AfterClass
	public static void setupEvidencia() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("User Name", "Bruno Carvalho");
		Reporter.setSystemInfo("Ecommerce Test", "Web Teste");
		Reporter.setSystemInfo("Sistema Operacional", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Ambiente", "Homologação");
		Reporter.setTestRunnerOutput("Execução do Teste Reports");
	}
	
}