package io.cucumber.danilo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class Form1Steps {
	@Dado("que eu estou no site {string}")
	public void que_eu_estou_no_site(String string) {
	    Configuracoes.abrir(string);
	}

	@Dado("seleciono Make e clico em {string}")
	public void seleciono_Make_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#make>option:nth-child(2)"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Dado("seleciono Model e clico em {string}")
	public void seleciono_Model_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#model>option:nth-child(2)"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Dado("informo em Cylinder Capacity {string}")
	public void informo_em_Cylinder_Capacity(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#cylindercapacity"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("informo em Engine Performance {string}")
	public void informo_em_Engine_Performance(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#engineperformance"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("digito em Date of Manufacture {string}")
	public void digito_em_Date_of_Manufacture(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#dateofmanufacture"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono em Number of Seats e clico em {string}")
	public void seleciono_em_Number_of_Seats_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#numberofseats>option:nth-child(3)"));
		assertTrue(input.isDisplayed());
		input.click();		
	}

	@Dado("seleciono em Right Hand Drive e clico em {string}")
	public void seleciono_em_Right_Hand_Drive_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(1)>div:nth-child(7)>p>label:nth-child(1)>span"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Dado("seleciono novamente Number of Seats e digito {string}")
	public void seleciono_novamente_Number_of_Seats_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#numberofseatsmotorcycle>option:nth-child(3)"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Dado("seleciono Fuel Type {string}")
	public void seleciono_Fuel_Type(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#fuel>option:nth-child(2)"));
		assertTrue(input.isDisplayed());
		input.click();    
	}

	@Dado("informo em Payload {string}")
	public void informo_em_Payload(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#payload"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("informo em Total Weight {string}")
	public void informo_em_Total_Weight(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#totalweight"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("informo em List Price {string}")
	public void informo_em_List_Price(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#listprice"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("informo em License Plate Number {string}")
	public void informo_em_License_Plate_Number(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#licenseplatenumber"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);    
	}

	@Dado("informo em Annual Mileage {string}")
	public void informo_em_Annual_Mileage(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#annualmileage"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);     
	}

	@Entao("devo clicar em Next para o formulario Insurant Data")
	public void devo_clicar_em_Next_para_o_formulario_Insurant_Data() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextenterinsurantdata"));
		assertTrue(input.isDisplayed());
		input.click();
	}
}