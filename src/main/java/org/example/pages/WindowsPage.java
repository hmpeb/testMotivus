package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class WindowsPage {
    WebDriver driver;
    public WindowsPage(WebDriver driver) {this.driver = driver;}
    public String valorPrecio;

    By windowsDropDown = By.cssSelector("#c-shellmenu_57");
    By searchButton = By.id("search");
    By inputSearch = By.id("cli_shellHeaderSearchInput");
    By modalLanguage= By.xpath("//body/div[@id='modalsRenderedAfterPageLoad']/div[@id='geo-selector-modal']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
    By shopButton = By.linkText("Shop");
    By firstPrice = By.xpath("//span[contains(text(),'$499.00')]");
    By priceSuscriotion = By.linkText("Visual Studio Enterprise Subscription");
    By closeModal = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]");

    public void clickOnWindowsDropDown() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement aboutWindowsDropdown = wait.until(ExpectedConditions.elementToBeClickable(windowsDropDown));
        aboutWindowsDropdown.click();
        Thread.sleep(1000);
        List<String> dropdownItems = Arrays.asList(
                "#c-shellmenu_58",
                "#c-shellmenu_59",
                "#c-shellmenu_60",
                "#c-shellmenu_61",
                "#c-shellmenu_62",
                "#c-shellmenu_63",
                "#c-shellmenu_64",
                "#c-shellmenu_65",
                "#c-shellmenu_66",
                "#c-shellmenu_67",
                "#c-shellmenu_68"
        );
        for (int i = 0; i<dropdownItems.toArray().length; i++) {
            String text = driver.findElement(By.cssSelector(dropdownItems.get(i))).getText();
            System.out.println("Esta presente: " + text);
        }
    }

    public void searchButton() {
        driver.findElement(searchButton).click();
    }

    public void inputSearch() throws InterruptedException {
        driver.findElement(inputSearch).sendKeys("Visual Studio");
        driver.findElement(searchButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalLanguage));
        Thread.sleep(1000);
        driver.findElement(modalLanguage).click();
    }

    public void printPrice() {
        driver.findElement(shopButton).click();
        String price = driver.findElement(firstPrice).getText();
        System.out.println("Primer valor obtenido: " + price);
        this.valorPrecio = price;
        System.out.println("Primer valor obtenido1: " + valorPrecio);
    }


    public String getValor() {
        return valorPrecio;
    }

    public void clickOnPrice() throws InterruptedException {
        driver.findElement(priceSuscriotion).click();
        Thread.sleep(1000);
        driver.findElement(closeModal).click();;
    }
}


