package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    //WebDriver driver = new ChromeDriver();
    WebDriver driver;
    public HomePage(WebDriver driver) {this.driver = driver;}

    By microsoft365Tab = By.cssSelector("#shellmenu_0");
    By teamsTab = By.cssSelector("#l0_Teams");
    By copilotTab= By.cssSelector("#shellmenu_2");
    By windowsTab= By.cssSelector("#shellmenu_3");
    By surfaceTab= By.cssSelector("#shellmenu_4");
    By xboxTab= By.cssSelector("#shellmenu_5");
    By dealsTab= By.cssSelector("#shellmenu_6");
    By smallByssinessTab= By.cssSelector("#l0_SmallBusiness");
    By supportTab= By.cssSelector("#l1_support");


    public void validationOfTabs() throws InterruptedException {
        Thread.sleep(1000);
        String text = driver.findElement(microsoft365Tab).getText();
        System.out.println("Tab: " + text);
        String text0 = driver.findElement(teamsTab).getText();
        System.out.println("Tab: " + text0);
        String text1 = driver.findElement(copilotTab).getText();
        System.out.println("Tab: " + text1);
        String text2 = driver.findElement(windowsTab).getText();
        System.out.println("Tab: " + text2);
        String text3 = driver.findElement(surfaceTab).getText();
        System.out.println("Tab: " + text3);
        String text4 = driver.findElement(xboxTab).getText();
        System.out.println("Tab: " + text4);
        String text5 = driver.findElement(dealsTab).getText();
        System.out.println("Tab: " + text5);
        String text6 = driver.findElement(smallByssinessTab).getText();
        System.out.println("Tab: " + text6);
        String text7 = driver.findElement(supportTab).getText();
        System.out.println("Tab: " + text7);
    }

    public void clickOnWindowsTab () {
        driver.findElement(windowsTab).click();
    }

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.microsoft.com/en-us/");

    }
}
