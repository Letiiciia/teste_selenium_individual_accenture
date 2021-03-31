package io.cucumber.danilo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class Form2Steps {
	@Dado("que eu estou no site da Trincentis no formulario {string}")
	public void que_eu_estou_no_site_da_Trincentis_no_formulario(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#enterinsurantdata")); 
	    assertTrue(input.isDisplayed());
	}

	@Dado("seleciono First Name e digito {string}")
	public void seleciono_First_Name_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#firstname"));
		input.sendKeys(string);
	}

	@Dado("seleciono Last Name e digito em {string}")
	public void seleciono_Last_Name_e_digito_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#lastname"));
		input.sendKeys(string);
	}

	@Dado("seleciono Date of Birth e digito {string}")
	public void seleciono_Date_of_Birth_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#birthdate"));
		input.sendKeys(string);
	}

	@Dado("seleciono Gender e clico em {string}")
	public void seleciono_Gender_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(2)>span"));
		input.click();	    
	}

	@Dado("digito em Street Adress {string}")
	public void digito_em_Street_Adress(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#streetaddress"));
		input.sendKeys(string);
	}

	@Dado("seleciono em Contry e clico em {string}")
	public void seleciono_em_Contry_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#country>option:nth-child(32)"));
		input.click();    
	}

	@Dado("seleciono em Zip Code e digito {string}")
	public void seleciono_em_Zip_Code_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#zipcode"));
		input.sendKeys(string);
	}
	
	@Dado("seleciono em City e digito {string}")
	public void seleciono_em_City_e_digito(String string) {
	    WebElement input = Configuracoes.browser.findElement(By.cssSelector("#city"));
		input.sendKeys(string);
	}
	
	@Dado("seleciono Occupation e seleciono {string}")
	public void seleciono_Occupation_e_seleciono(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#occupation>option:nth-child(2)"));
		input.click(); 
	}

	@Dado("seleciono Hobbies e clico em {string}")
	public void seleciono_Hobbies_e_clico_em(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)>span"));
		input.click();		
	}

	@Dado("informo em Website {string}")
	public void informo_em_Website(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#website"));
		input.click(); 
	}

	@Entao("devo clicar em Next para o formulario Enter Product Data")
	public void devo_clicar_em_Next_para_o_formulario_Enter_Product_Data() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextenterproductdata"));
		input.click();     
	}
}