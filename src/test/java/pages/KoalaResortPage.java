package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaResortPage {

   public KoalaResortPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="details-button")
    public WebElement advanced;
    @FindBy(id="proceed-link")
    public WebElement proceedLink;

    @FindBy(xpath = "//a[text()=\"Log in\"]")
    public WebElement logIn;
    @FindBy(id="UserName")
    public WebElement userName;
    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement submit;

}
