package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.danilo.servicos.Configuracoes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class form5Steps {
	@Dado("seleciono E-mail e digito {string}")
	public void seleciono_E_mail_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#email"));
		input.sendKeys(string);
	}

	@Dado("seleciono Phone e digito {string}")
	public void seleciono_Phone_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#phone"));
		input.sendKeys(string);
	}

	@Dado("seleciono Username e digito {string}")
	public void seleciono_Username_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#username"));
		input.sendKeys(string);
	}

	@Dado("seleciono Password e digito {string}")
	public void seleciono_Password_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#password"));
		input.sendKeys(string);
	}

	@Dado("seleciono Confirm Password e digito {string}")
	public void seleciono_Confirm_Password_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#confirmpassword"));
		input.sendKeys(string);
	}

	@Dado("seleciono Comments e digito {string}")
	public void seleciono_Comments_e_digito(String string) {
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#Comments"));
		input.sendKeys(string);
	}

	@Entao("devo clicar em Send")
	public void devo_clicar_em_Send() throws InterruptedException{
		Thread.sleep(5000);
		WebElement input = Configuracoes.browser.findElement(By.cssSelector("#sendemail"));
		input.click();
		Configuracoes.fechar();
	}		
}
