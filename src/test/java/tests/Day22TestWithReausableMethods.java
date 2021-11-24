package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Day22TestWithReausableMethods {

@Test
    public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    AmazonPage amazonPage=new AmazonPage();

    amazonPage.accept.click();

    List<WebElement> allTds=amazonPage.allTd;
    System.out.println(ReusableMethods.getElementsText(allTds));
    
}




}
