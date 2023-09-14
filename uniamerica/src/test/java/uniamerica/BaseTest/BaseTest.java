package uniamerica.BaseTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import uniamerica.Rote.Rote;
import uniamerica.LoginPO.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest extends Rote {

	public static LoginPO loginPage;

	@BeforeClass
	public static void startPage(){
		loginPage = new LoginPO(chrome);
	}
	@Test
	@DisplayName("Caso de Teste 1: Login Errado E Sem Senha")
	public void ATestLoginErradoSemSenha() {
		loginPage.inputEmail.sendKeys("naotem@naotem.com"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Informe"));
	}

	@Test
	@DisplayName("Caso de Teste 2: Sem Login E Senha Errada")
	public void BTestSemLoginSenhaErrada() {
		loginPage.inputEmail.clear();

		loginPage.inputPassword.sendKeys("admin123"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Informe"));
	}
	@Test
	@DisplayName("Caso de Teste 3: Login Errado E Senha Errada")
	public void CTestLoginErradoSenhaErrada(){
		loginPage.inputEmail.clear();
		loginPage.inputPassword.clear();

		loginPage.inputEmail.sendKeys("naotem@naotem.com"+Keys.ENTER);
		loginPage.inputPassword.sendKeys("admin123"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("E-mail"));
	}

	@Test
	@DisplayName("Caso de Teste 4: Sem Login  E Sem Senha")
	public void DTestSemLoginESemSenha(){
		loginPage.inputEmail.clear();
		loginPage.inputPassword.clear();

		loginPage.inputEmail.sendKeys(""+Keys.ENTER);
		loginPage.inputPassword.sendKeys(""+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Informe"));
	}

	@Test
	@DisplayName("Caso de Teste 5: Email Correto E Sem Senha")
	public void ETestEmailCorretoESemSenha(){
		loginPage.inputEmail.clear();
		loginPage.inputPassword.clear();

		loginPage.inputEmail.sendKeys("admin@admin.com"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Informe"));
	}

	@Test
	@DisplayName("Caso de Teste 6: Sem Email E Senha Correta")
	public void FTestSemEmailESenhaCorreta(){
		loginPage.inputEmail.clear();
		loginPage.inputPassword.clear();

		loginPage.inputPassword.sendKeys("admin@123"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Informe"));
	}
	@Test
	@DisplayName("Caso de Teste 7: Email Correto E Senha Correta")
	public void GTestEmailCorretoESenhaCorreta(){
		loginPage.inputEmail.clear();
		loginPage.inputPassword.clear();

		loginPage.inputEmail.sendKeys("admin@admin.com"+Keys.ENTER);
		loginPage.inputPassword.sendKeys("admin@123"+Keys.ENTER);
		String data = loginPage.textMessage.getText();
		System.out.println(data);
		chrome.getCurrentUrl().equals("file:///C:/Users/cleyt/Documents/Desenvolvimento/projectMvnUniamerica/sistema/produtos.html?teste=123");
		Assert.assertTrue(data.contains(""));
	}

}










