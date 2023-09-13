package uniamerica.Rote;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Rote {
	
	protected static WebDriver chrome;
	
	@BeforeClass
	public static void startAplication() {
		chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("file:///C:/Users/cleyt/Documents/Desenvolvimento/projectMvnUniamerica/sistema/login.html");
	}
	
	@AfterClass
	public static void closeAplication() {
		chrome.quit();
	}
	
	

}
