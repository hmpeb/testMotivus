package org.example.manager;

import org.example.pages.HomePage;
import org.example.pages.WindowsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MicrosoftPageObjects {
    public MicrosoftPageObjects(){}

    private WindowsPage windowsPage;
    private HomePage homePage;
    WebDriver driver = new ChromeDriver();

    public WindowsPage getWindowsPage() {
        return (windowsPage == null) ? windowsPage = new WindowsPage(driver) : windowsPage;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

}
