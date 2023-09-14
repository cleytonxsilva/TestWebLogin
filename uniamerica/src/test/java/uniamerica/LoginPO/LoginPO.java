package uniamerica.LoginPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uniamerica.BasePO.BasePO;

public class LoginPO extends BasePO{
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputPassword;

    @FindBy(id = "mensagem")
    public WebElement textMessage;

    public LoginPO(WebDriver chrome){
        super(chrome);
    }
}
