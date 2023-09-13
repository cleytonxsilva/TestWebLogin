package uniamerica.BaseTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import uniamerica.Rote.Rote;
import uniamerica.GooglePO.*;
public class BaseTest extends Rote {

	public static GooglePO googlePage;

	@BeforeClass
	public static void startPage(){
		googlePage = new GooglePO(chrome);
	}
	@Test
	public void TesteWebDriver() {
		chrome.findElement(By.name("q")).sendKeys("Winx 2023"+Keys.ENTER);
		String data = chrome.findElement(By.id("result-stats")).getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Aproximadamentee"));
	}

}










