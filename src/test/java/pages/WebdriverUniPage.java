package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebdriverUniPage {

    public WebdriverUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   @FindBy (xpath = "//iframe[@id='frame']")
    public WebElement frame;


    @FindBy (linkText = "Our Products")
    public WebElement ourProducts;


    @FindBy (xpath = "//div[@id='cameras']")
    public WebElement cameras;


    @FindBy (xpath = "//*[@id=\"myModal\"]/div/div/div[2]/p")
    public WebElement popUpMesaj;



    @FindBy (xpath = "//*[@id=\"myModal\"]/div/div/div[3]/button[2]")
    public WebElement popUpClose;



    @FindBy (xpath = "//*[@id=\"nav-title\"]")
    public  WebElement iframeLinkiElementi;




















}
