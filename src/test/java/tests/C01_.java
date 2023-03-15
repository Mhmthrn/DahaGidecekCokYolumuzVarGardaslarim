package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebdriverUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_  {
    WebdriverUniPage webdriverUniPage= new WebdriverUniPage();

    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void WebdriverUniTest(){

        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));
        String homeWHD= Driver.getDriver().getWindowHandle();

        //2. “Our Products” butonuna basin


        Driver.getDriver().switchTo().frame(webdriverUniPage.frame);

        webdriverUniPage.ourProducts.click();

       // 3. “Cameras product”i tiklayin


        //Driver.getDriver().switchTo().window(homeWHD);

        webdriverUniPage.cameras.click();


       //  4. Popup mesajini yazdirin

        actions.sendKeys(Keys.HOME).perform();


        String popUpMesaj=webdriverUniPage.popUpMesaj.getText();

        System.out.println(popUpMesaj);


        // 5. “close” butonuna basin

        ReusableMethods.bekle(1);


        webdriverUniPage.popUpClose.click();


       // 6. "WebdriverUniversity.com (IFrame)" linkini tiklayin


        Driver.getDriver().switchTo().window(homeWHD);
        webdriverUniPage.iframeLinkiElementi.click();


       // 7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin

        String expectedUrl= "http://webdriveruniversity.com/index.html";

        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);


        Driver.closeDriver();


    }






}