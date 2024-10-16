package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCart {
    WebDriver driver;
    public ShoppingCart(WebDriver driver) {this.driver = driver;}
    By item1 = By.cssSelector("css=.container--kdayICWW");
    By item2 = By.cssSelector("css=.greyBox--s2LmlIee");
    By item3 = By.cssSelector("css=.greyBox--s2LmlIee");

    public void comparePrice() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame(2);
        String item11 = driver.findElement(item1).getText();
        String item22 = driver.findElement(item2).getText();
        String item33 = driver.findElement(item3).getText();

        System.out.printf("Precios diferentes? " + item11);
        System.out.printf("Precios diferentes? " + item22);
        System.out.printf("Precios diferentes? " + item33);


    }

    public void validateAmount() {

    }
}
