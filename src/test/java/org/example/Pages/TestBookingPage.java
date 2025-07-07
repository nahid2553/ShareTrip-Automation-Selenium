package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestBookingPage extends DriverSetup {

     public By oneWayTrip = By.xpath("//p[normalize-space()='One Way']");
     public By roundTrip = By.xpath("//p[normalize-space()='Round Trip']");
     public By multiCityTrip = By.xpath("//p[normalize-space()='Multi City']");
    @Test
    public void bookOneWayTrip(){
        ShareTrip.get("https://sharetrip.net/");


    }

}

