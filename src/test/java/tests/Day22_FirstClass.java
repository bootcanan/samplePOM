package tests;

import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day22_FirstClass {

    @Test

    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        KoalaResortPage koalaResortPage=new KoalaResortPage();
        koalaResortPage.advanced.click();
        koalaResortPage.proceedLink.click();


   Driver.closeDriver();
    }
}
