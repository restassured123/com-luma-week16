package com.luma.pages;


import com.luma.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenPantsPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPantsPage.class.getName());

    public MenPantsPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement coronusYogaPants;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement coronusYogaPants32;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement coronusYogaPantsBlack;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToShoppingCartTextMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public void mouseHoverOnCoronusYogaPantsAndClickOn32() throws InterruptedException {
        log.info("Mouse hover on Over Coronus yoga pants and click on 32 : " + coronusYogaPants32.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPants32);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnBlack() throws InterruptedException {
        log.info("Mouse hover on Over Coronus yoga pants and click on Black : " + coronusYogaPantsBlack.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPantsBlack);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnAddToCart() throws InterruptedException {
        log.info("Mouse hover on Over Coronus yoga pants and click on addToCart : " + addToCart.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(addToCart);
    }

    public String getAddedToCartMessage(){
        log.info("Get added to cart message : " + addedToShoppingCartTextMessage.toString());
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement(){
        log.info("Click on shopping cart : " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

}
