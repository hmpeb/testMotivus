package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class ShopDetails {
    WebDriver driver;
    public ShopDetails(WebDriver driver) {this.driver = driver;}
    public String nuevoPrecio;
    public String antiguoPrecio;
    By addToCartButton = By.cssSelector("#buybox-cta-proper");
    By getPrice = By.xpath("//*[@id=\"rootContainer_BuyBox\"]/section[1]/div[1]/div[3]/div[1]/p[1]/span[1]");

    public void getPrice() {
        String precio = driver.findElement(getPrice).getText();
        System.out.printf("Precio: " + precio);

        WindowsPage valorObtenido = new WindowsPage(driver);
        String valorPrevio = valorObtenido.getValor();
        System.out.printf("Valor anterior: " + valorPrevio);

        this.antiguoPrecio = valorPrevio;
        this.nuevoPrecio = precio;
    }

    public void compararPrecios() {
        if (Objects.equals(nuevoPrecio, antiguoPrecio)) {
            System.out.printf("Los precios son iguales");
        } else {
            System.out.printf("Los precios son diferentes");
        }
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(addToCartButton).click();
    }
}
