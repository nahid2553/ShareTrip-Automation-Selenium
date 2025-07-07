package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightBooking extends DriverSetup {

    public By oneWayTrip = By.xpath("//p[normalize-space()='One Way']");
    public By roundTrip = By.xpath("//p[normalize-space()='Round Trip']");
    public By multiCityTrip = By.xpath("//p[normalize-space()='Multi City']");

    public By departureAirport = By.xpath("//div[@class='mui-style-1op629j']//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]");
    public By departureAirportCross = By.xpath("//div[@class='mui-style-1op629j']//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M19 6.41L1')]");
    public By departureAirportName = By.xpath("//input[contains(@id, 'r') and contains(@id, ':')]");
    public By selectDepartureAirport = By.xpath("//p[contains(@class, 'heading') and text()='DAC']");

    public By destinationAirportCross = By.xpath("//div[3]//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M19 6.41L1')]");
    public By destinationAirportName = By.xpath("//input[@id=':rh:']");
    public By selectDestinationAirport = By.xpath("//p[contains(@class, 'heading') and text()='CXB']");

    public By clickOnDate = By.xpath("//div[@class='MuiBox-root mui-style-juiuv6']//div[@class='MuiStack-root mui-style-1r5to7m']");
    public By changeMonth = By.xpath("//div[@class='MuiBox-root mui-style-0']//button[2]//*[name()='svg']//*[name()='path']");
   // public By selectFlightDate = By.xpath("//td[@aria-label='Thursday, July 31, 2025']//p[@class='MuiTypography-root MuiTypography-body1 mui-style-cwrsrn'][normalize-space()='31']");
    public By selectFlightDate = By.cssSelector(" td[aria-label='Thursday, July 31, 2025'] p[class='MuiTypography-root MuiTypography-body1 mui-style-cwrsrn']");
    public By clickOnTraveller = By.xpath("//button[@id='traveller-count-button']");
    public By addAdultsTraveller = By.xpath("//button[@id=':r82:']//span[@class='mui-style-1sjvzwv']//*[name()='svg']//*[name()='path']");
    public By addChildrenTraveller = By.xpath("//button[@id=':r84:']//span[@class='mui-style-1sjvzwv']//*[name()='svg']//*[name()='path']");
    public By addKidsTraveller = By.xpath("//button[@id=':r84:']//span[@class='mui-style-1sjvzwv']//*[name()='svg']//*[name()='path']");
    public By addInfantsTraveller = By.xpath("//button[@id=':r88:']//span[@class='mui-style-1sjvzwv']//*[name()='svg']");
    public By clickDoneForTraveller = By.xpath("//button[@id=':r89:']");

    public By clickTravelClass = By.xpath("//button[normalize-space()='Economy']");
    public By selectFirstClassTravel = By.xpath("//input[@value='First']");

    public By clickSearchButton = By.xpath("//span[@class='MuiButton-icon MuiButton-startIcon MuiButton-iconSizeLarge mui-style-wth0qt']//*[name()='svg']");



}

