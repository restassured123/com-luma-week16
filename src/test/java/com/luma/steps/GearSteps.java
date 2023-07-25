package com.luma.steps;

import com.luma.pages.DufflePage;
import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("I mouse hover on gear menu")
    public void iMouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("I click on bags")
    public void iClickOnBags() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnBags();
    }

    @And("I click on product name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() throws InterruptedException {
        new GearPage().clickOnOvernightDuffleElement();
    }

    @And("I change the quantity {string}")
    public void iChangeTheQuantity(String qty) {
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new DufflePage().clickOnOverAddToCartButton();
    }

    @Then("I verify the text of the product {string}")
    public void iVerifyTheTextOfTheProduct(String arg0) throws InterruptedException {
        new DufflePage().getAddedToCartMessage();
    }

    @And("I click on shopping cart link into messae")
    public void iClickOnShoppingCartLinkIntoMessae() throws InterruptedException {
        new DufflePage().clickOnShoppingCartElement();
    }

    @Then("I verify the produt name {string}")
    public void iVerifyTheProdutName(String arg0) throws InterruptedException {
        new ShoppingCartPage().getTextProductNameTextElement();
    }

    @Then("I verify the quantity {string}")
    public void iVerifyTheQuantity(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getInputQty());

    }

    @Then("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getProductPrice());

    }

    @And("I Change quantity to {string}")
    public void iChangeQuantityTo(String qty) {
        new ShoppingCartPage().changeQuantity(qty);

    }

    @And("I click on update shopping cart button")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdate();
    }

    @Then("I Verify the price of the product {string}")
    public void iVerifyThePriceOfTheProduct(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getUpdatedProductPrice());
    }
}
