package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPantsPage;
import com.luma.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MenSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("I click on Pants")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on size")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() throws InterruptedException {
        new MenPantsPage().mouseHoverOnCoronusYogaPantsAndClickOn32();
    }

    @And("I mouse Hover on product name Cronus Yoga Pant and click on colour Black")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPantsPage().mouseHoverOnCoronusYogaPantsAndClickOnBlack();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPantsPage().mouseHoverOnCoronusYogaPantsAndClickOnAddToCart();
    }

    @Then("I verify the text {string}")
    public void iVerifyTheText(String arg0) {
        new MenPantsPage().getAddedToCartMessage();
    }

    @And("I click on Shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPantsPage().clickOnShoppingCartElement();
    }

    @Then("I verify the text of {string}")
    public void iVerifyTheTextOf(String arg0) {
       new ShoppingCartPage().getShoppingCartText();


    }

    @Then("I verify the product name {string}")
    public void iVerifyTheProductName(String arg0) {
        new ShoppingCartPage().getCoronusYogaPantText();
    }

    @Then("I Verify the product size {string}")
    public void iVerifyTheProductSize(String arg0) {
        new ShoppingCartPage().getSize32Text();

    }

    @Then("I verify the product colour {string}")
    public void iVerifyTheProductColour(String arg0) {
        new ShoppingCartPage().getColourBlackText();
    }
}
