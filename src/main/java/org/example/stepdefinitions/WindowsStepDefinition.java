package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.manager.MicrosoftPageObjects;

public class WindowsStepDefinition
{
    private final MicrosoftPageObjects pages = new MicrosoftPageObjects();

    @Then("I click on about windows menu and print elements in dropdown in windows page")
    public void clickOnAboutWindows() throws InterruptedException {
        pages.getWindowsPage().clickOnWindowsDropDown();
    }

    @Then("I click on search button in windows page")
    public void clickOnSearchButton() {
        pages.getWindowsPage().searchButton();
    }

    @When("I search for Visual Studio in windows page")
    public void serachVisualStudio() throws InterruptedException {
        pages.getWindowsPage().inputSearch();
    }

    @Then("I print the price of the Selected Element in windows page")
    public void printPrice() {
        pages.getWindowsPage().printPrice();
    }
}
