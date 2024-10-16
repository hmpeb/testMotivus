package org.example;

import org.example.pages.HomePage;
import org.example.pages.ShopDetails;
import org.example.pages.ShoppingCart;
import org.example.pages.WindowsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MicrosoftHomePage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.microsoft.com/en-us/");

        HomePage elementsHome = new HomePage(driver);
        elementsHome.validationOfTabs();
        elementsHome.clickOnWindowsTab();

        WindowsPage elementsWindows = new WindowsPage(driver);
        elementsWindows.clickOnWindowsDropDown();
        elementsWindows.searchButton();
        elementsWindows.inputSearch();
        elementsWindows.printPrice();
        elementsWindows.clickOnPrice();

        ShopDetails elementsShopDetails = new ShopDetails(driver);
        elementsShopDetails.getPrice();
        elementsShopDetails.compararPrecios();
        elementsShopDetails.addToCart();

        ShoppingCart elementsShopping = new ShoppingCart(driver);
        elementsShopping.comparePrice();

        //driver.quit();

    }
}
