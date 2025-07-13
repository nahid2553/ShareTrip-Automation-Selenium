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
    public By destinationAirportName = By.xpath("//input[@id=':rh:']"); //
    public By selectDestinationAirport = By.xpath("//p[contains(@class, 'heading') and text()='CXB']");

    public By clickFirstFlightDate = By.xpath("//div[@class='MuiBox-root mui-style-juiuv6']//div[@class='MuiStack-root mui-style-1r5to7m']");
    public By changeMonth = By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[14]");
    public By selectFlightDate = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 mui-style-cwrsrn'][normalize-space()='31'])[1]");
    public By clickOnTraveller = By.xpath("//button[@id='traveller-count-button']");
    public By addAdultsTraveller = By.xpath("(//*[name()='svg'])[151]");
    public By addChildrenTraveller = By.xpath("(//*[name()='svg'])[154]");
    public By addKidsTraveller = By.xpath("(//*[name()='svg'])[157]");
    public By addInfantsTraveller = By.xpath("(//*[name()='svg'])[160]");
    public By clickDoneForTraveller = By.xpath("//span[normalize-space()='Done']");

    public By clickTravelClassWhenEconomyIsSelected = By.xpath("//button[normalize-space()='Economy']");
    public By clickTravelClassWhenFirstClassIsSelected = By.xpath("//button[normalize-space()='First Class']");
    public By clickTravelClassWhenBusinessClassIsSelected = By.xpath("//button[normalize-space()='Business']");
    public By clickTravelClassWhenPremiumEconomyClassIsSelected = By.xpath("//button[normalize-space()='Premium Economy']");


    public By selectFirstClassTravel = By.xpath("//input[@value='First']");
    public By selectBusinessClassTravel = By.xpath("//input[@value='Business']");
    public By selectPremiumEconomyClassTravel = By.xpath("//input[@value='Premium Economy']");
    public By selectEconomyClassTravel = By.xpath("//input[@value='Economy']");

    public By clickModifySearch = By.xpath("//span[normalize-space()='Modify']");
    public By clickSearchButton = By.xpath("//span[@class='MuiButton-icon MuiButton-startIcon MuiButton-iconSizeLarge mui-style-wth0qt']//*[name()='svg']");


}

