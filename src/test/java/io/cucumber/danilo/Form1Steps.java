package io.cucumber.danilo;

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
		input.click();
	}

	@Dado("seleciono Model e clico em {string}")
	public void seleciono_Model_e_clico_em(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em Cylinder Capacity {string}")
	public void informo_em_Cylinder_Capacity(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em Engine Performance {string}")
	public void informo_em_Engine_Performance(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("digito em Date of Manufacture {string}")
	public void digito_em_Date_of_Manufacture(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("seleciono em Number of Seats e clico em {string}")
	public void seleciono_em_Number_of_Seats_e_clico_em(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("seleciono em Right Hand Drive e clico em {string}")
	public void seleciono_em_Right_Hand_Drive_e_clico_em(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("seleciono novamente Number of Seats e digito {string}")
	public void seleciono_novamente_Number_of_Seats_e_digito(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("seleciono Fuel Type {string}")
	public void seleciono_Fuel_Type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em Payload {string}")
	public void informo_em_Payload(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em Total Weight {string}")
	public void informo_em_Total_Weight(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em List Price {string}")
	public void informo_em_List_Price(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em License Plate Number {string}")
	public void informo_em_License_Plate_Number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("informo em Annual Mileage {string}")
	public void informo_em_Annual_Mileage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("devo clicar em Next para o formulario Insurant Data")
	public void devo_clicar_em_Next_para_o_formulario_Insurant_Data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}