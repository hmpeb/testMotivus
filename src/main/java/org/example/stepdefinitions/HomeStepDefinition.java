package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.manager.MicrosoftPageObjects;

public class HomeStepDefinition {
    private final MicrosoftPageObjects pages = new MicrosoftPageObjects();

    @Given("I open the browser in the microsoft page")
    public void openBrowser() {
        pages.getHomePage().openBrowser();
    }

    @Then("I validate the menu items are present in microsoft page")
    public void validationOfItemMenu() throws InterruptedException {
        pages.getHomePage().validationOfTabs();
    }

    @When("I go to windows in microsoft page")
    public void goToWindowsPage() {
        pages.getHomePage().clickOnWindowsTab();
    }
}
