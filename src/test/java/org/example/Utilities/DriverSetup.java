package org.example.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {
  //  public WebDriver ShareTrip;
    public static String browserName = System.getProperty("chrome","Chrome");

    private static final ThreadLocal<WebDriver> LOCAL_BROWSER = new ThreadLocal<>();

    public static void setShareTrip(WebDriver shareTrip){ //setter method
        DriverSetup.LOCAL_BROWSER.set(shareTrip);
    }

    public static WebDriver getShareTrip(){ //getter method
        return LOCAL_BROWSER.get();
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

    @BeforeSuite
    public void openBrowser(){

        WebDriver shareTrip = getBrowser(browserName);
        shareTrip.manage().window().maximize();
        shareTrip.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setShareTrip(shareTrip);
    }

    @AfterSuite
    public void closeBrowser(){
        getShareTrip().quit();
    }
}
