package io.cucumber.danilo;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;


public class form4Steps {
	@Dado("seleciono Select Option o plano Gold")
	public void seleciono_Select_Option_o_plano_Gold() {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#priceTable>tfoot>tr>th.group>label:nth-child(2)"));
		assertTrue(input.isDisplayed());
		input.click();	
	}

	@Entao("devo clicar em Next para o formulario Send Quote")
	public void devo_clicar_em_Next_para_o_formulario_Send_Quote() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#nextsendquote"));
		assertTrue(input.isDisplayed());
		input.click();
	}		
}
