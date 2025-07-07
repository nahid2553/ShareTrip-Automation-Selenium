package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage extends DriverSetup {
    private WebDriver driver;
    FlightBooking flightBooking = new FlightBooking();
    public String homePageUrl = "https://sharetrip.net/";

    public WebElement getElement(By locator){
        return getShareTrip().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void clickDropdownElement(By  locator) throws InterruptedException {
        Actions actions = new Actions(getShareTrip());
        actions.sendKeys(Keys.ENTER).build().perform();
      //  Thread.sleep(1000);
    }

    public void clickOnCalenderElement() throws InterruptedException {
       String date = "31";
       getShareTrip().findElement(By.xpath("//td[@aria-label='Thursday, July 31, 2025']//p[@class='MuiTypography-root MuiTypography-body1 mui-style-cwrsrn'][normalize-space()='31']")).click();
       Thread.sleep(3000);



    }

    public void writeOnElement1(By locator){
        getElement(locator).sendKeys("Dhaka");
    }

    public void writeOnElement2(By locator){
        getElement(locator).sendKeys("Cox's Bazar");
    }

}
