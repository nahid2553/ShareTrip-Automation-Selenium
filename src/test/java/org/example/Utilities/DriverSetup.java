package org.example.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver ShareTrip;
    public static String browserName = System.getProperty("firefox","Chrome");

    @BeforeSuite
    public void openBrowser(){
        ShareTrip = getBrowser(browserName);
        ShareTrip.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser(){
        ShareTrip.quit();
    }

    public WebDriver getBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if(browserName.equalsIgnoreCase("Edge"))
                return new EdgeDriver();
        else if(browserName.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else {
            throw new RuntimeException("Browser is not available with this given name: "+ browserName);
        }
    }
}
