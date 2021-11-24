package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

   public  AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id=\"sp-cc-accept\"]")
    public WebElement accept;

   @FindBy(xpath = "//td")
    public List<WebElement> allTd;

   @FindBy(xpath="//tbody//tr")
   public List<WebElement>rowNum;

    @FindBy(xpath="//tbody//tr[1]//td")
    public List<WebElement>fristcellNum;

   public void goDownofThePage(){

       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.END).perform();


   }

   public String findTheCellData(int row,int column){
        String cellPath="//tbody//tr["+row+"]//td["+column+"]";

        String cellData=Driver.getDriver().findElement(By.xpath(cellPath)).getText();
       return cellData;
   }



}
