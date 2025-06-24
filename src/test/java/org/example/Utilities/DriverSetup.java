package org.example.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver ShareTrip;

    @BeforeSuite
    public void openBrowser(){
        ShareTrip = new FirefoxDriver();
        ShareTrip.manage().window().maximize();

    }

    @AfterSuite
    public void closeBrowser(){
        ShareTrip.quit();

    }
}
