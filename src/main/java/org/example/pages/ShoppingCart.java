package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
    WebDriver driver;
    public ShoppingCart(WebDriver driver) {this.driver = driver;}
    By item1 = By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[2]/span[1]");
    By item2 = By.cssSelector("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/div[1]/span[1]/span[2]/span[1]");
    By item3 = By.cssSelector("//body/main[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[2]/span[1]");

    public void comparePrice() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame("purchase-frame");
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
