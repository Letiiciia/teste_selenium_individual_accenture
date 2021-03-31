package io.cucumber.danilo;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.*;

public class form5Steps {
	@Dado("seleciono E-mail e digito {string}")
	public void seleciono_E_mail_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#email"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono Phone e digito {string}")
	public void seleciono_Phone_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#phone"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono Username e digito {string}")
	public void seleciono_Username_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#username"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono Password e digito {string}")
	public void seleciono_Password_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#password"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono Confirm Password e digito {string}")
	public void seleciono_Confirm_Password_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#confirmpassword"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}

	@Dado("seleciono Comments e digito {string}")
	public void seleciono_Comments_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#Comments"));
		assertTrue(input.isDisplayed());
		input.sendKeys(string);
	}
	@Dado("devo clicar em Send")
	public void devo_clicar_em_Send() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#sendemail"));
		assertTrue(input.isDisplayed());
		input.click();
	}

	@Entao("ver a mensagem {string}")
	public void ver_a_mensagem(String string) throws InterruptedException{
		Thread.sleep(9000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("h2"));
		assertTrue(input.isDisplayed());
		Configuracoes.fechar();
	}
}
