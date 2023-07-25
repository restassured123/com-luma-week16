package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement quantity;
    //By quantity = By.xpath("(//input[@class='input-text qty'])[1]");

    By attributeValue = By.xpath("//input[@title='Qty']");

    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement update;
    //By update = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement updatedProductPrice;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement coronusYogaPantsTextElement;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyWaistSizeMen;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourBlackTextElement;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='base'])[1]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameTextElement;

    public String getTextProductNameTextElement() throws InterruptedException {
        log.info("Get product name text : " + productNameTextElement.toString());
        Thread.sleep(1000);
        return getTextFromElement(productNameTextElement);
    }

    public String getInputQty(){
        return getAttributeValueFromElement((By)attributeValue);
    }
    public String getProductPrice() throws InterruptedException {
        log.info("Get product price : " + productPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(productPrice);
    }
    public void changeQuantity(String text) {
        Reporter.log("Change Quantity "+text);
        quantity.clear();
        sendTextToElement(quantity, text);

    }

    public void clickOnUpdate() {
        Reporter.log("Click on Update");
        clickOnElement(update);
    }
    public String getUpdatedProductPrice() throws InterruptedException {
        log.info("Get updated product price : " + updatedProductPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(updatedProductPrice);
    }
    public String getCoronusYogaPantText(){
        //log.info("Get Coronus yoga pant : " + coronusYogaPantsTextElement.toString());
        return getTextFromElement(coronusYogaPantsTextElement);
    }
    public String getSize32Text(){
        return getTextFromElement(verifyWaistSizeMen);
    }
    public String getColourBlackText(){
        return getTextFromElement(colourBlackTextElement);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }


}
