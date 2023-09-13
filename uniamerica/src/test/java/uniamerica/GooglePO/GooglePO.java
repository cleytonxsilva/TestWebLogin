package uniamerica.GooglePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uniamerica.BasePO.BasePO;

public class GooglePO extends BasePO{
    @FindBy(name = "q")
    public WebElement inputSearch;

    @FindBy(id = "result-stats")
    public WebElement resultSearch;

    public GooglePO(WebDriver chrome){
        super(chrome);
    }
}
