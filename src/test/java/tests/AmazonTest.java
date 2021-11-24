package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class AmazonTest extends TestBaseRapor {

    @Test
    public void hucreTest(){
        //Bu class’in altinda bir test method olusturun : hucretesti() ve
        // webtable’da 3. satir 7.sutundaki yazinin “Home Services” yazisi icerdigini test edin

        extentTest= extentReports.createTest("hucre testi","3.satir 7.sutundaki yazinin dogrulugunu test ettik");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        extentTest.info("amazon sayfasina git");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.goDownofThePage();
        extentTest.info("go down of the oage");
        ReusableMethods.waitFor(5);


        String hucreYazisi= amazonPage.findTheCellData(1,1);
        System.out.println(hucreYazisi);
        extentTest.info("find the cell data");
        Assert.assertTrue(hucreYazisi.contains("Amazon"));
       extentTest.pass("hucredeki yazi dogru, test PASS");
    }

    @Test
    public void AmazonYazisi(){
        //tabloda 9 Hucrede “Amazon” yazisi bulundugunu test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.goDownofThePage();
        ReusableMethods.waitFor(10);
        int numOfAmazon=0;

        for (int i=1 ; i<=amazonPage.rowNum.size(); i+=2){
            for (int j=1 ; j<=amazonPage.fristcellNum.size(); j+=2){

                if (amazonPage.findTheCellData(i,j).contains("Amazon")){
                    numOfAmazon++;
                }
            }

        }

        System.out.println(numOfAmazon);
        ReusableMethods.waitFor(10);
        Driver.closeDriver();
    }
}
