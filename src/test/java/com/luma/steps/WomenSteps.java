package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenSteps {
    @Given("I am on the on Luma website homepage")
    public void iAmOnTheOnLumaWebsiteHomepage() {

    }

    @When("I mouse hover on women Menu")
    public void iMouseHoverOnWomenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("I mouse Hover on Tops")
    public void iMouseHoverOnTops() throws InterruptedException {
        new HomePage().mouseHoverOnTops();
    }

    @And("I click on Jackets")
    public void iClickOnJackets() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnJackets();
    }

    @And("I select sort by filter as  Product Name")
    public void iSelectSortByFilterAsProductName() {
        new WomenPage().productListBeforeSorting();
    }

    @Then("I verify the products name display in alphabetical order")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        new WomenPage().productListAfterSorting();
    }

    @And("I select sort by filter as Price")
    public void iSelectSortByFilterAsPrice() {
        new WomenPage(). priceListBeforeSorting();
    }

    @Then("I verify the products price display in low to high")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        new WomenPage(). priceListAfterSorting();
    }
}
