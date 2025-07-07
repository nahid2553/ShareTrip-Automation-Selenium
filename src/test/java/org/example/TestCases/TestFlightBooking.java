package org.example.TestCases;

import org.example.Pages.FlightBooking;
import org.example.Pages.HomePage;
import org.example.Utilities.DriverSetup;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//only test step and validation
public class TestFlightBooking extends DriverSetup {

    HomePage homePage =new HomePage();
    FlightBooking flightBooking = new FlightBooking();

    @Test
    public void bookAOneWayFlight() throws InterruptedException {
        getShareTrip().get(homePage.homePageUrl);
       // Thread.sleep(1000);

        homePage.clickOnElement(flightBooking.oneWayTrip);
      //  Thread.sleep(1000);
        homePage.clickOnElement(flightBooking.departureAirport);
        homePage.clickOnElement(flightBooking.departureAirportCross);
      //  Thread.sleep(1000);
        homePage.writeOnElement1(flightBooking.departureAirportName);
      //  Thread.sleep(1000);
        homePage.clickDropdownElement(flightBooking.selectDepartureAirport);
      //  Thread.sleep(1000);

        homePage.clickOnElement(flightBooking.destinationAirportCross);
//        Thread.sleep(3000);
        homePage.writeOnElement2(flightBooking.destinationAirportName);
//        Thread.sleep(3000);
        homePage.clickDropdownElement(flightBooking.selectDestinationAirport);
//        Thread.sleep(3000);
//
        homePage.clickOnElement(flightBooking.clickOnDate);
    //    Thread.sleep(3000);
        homePage.clickOnCalenderElement();
       Thread.sleep(5000);

//        homePage.clickOnElement(flightBooking.clickOnTraveller);
//        Thread.sleep(3000);
//        homePage.clickDropdownElement(flightBooking.addAdultsTraveller);
//        Thread.sleep(3000);
//        homePage.clickOnElement(flightBooking.addChildrenTraveller);
//        Thread.sleep(3000);
//        homePage.clickOnElement(flightBooking.addKidsTraveller);
//        Thread.sleep(3000);
//        homePage.clickOnElement(flightBooking.addInfantsTraveller);
//        Thread.sleep(3000);
//        homePage.clickOnElement(flightBooking.clickDoneForTraveller);
//        Thread.sleep(3000);
//
//        homePage.clickOnElement(flightBooking.clickTravelClass);
//        Thread.sleep(3000);
//        homePage.clickOnElement(flightBooking.selectFirstClassTravel);
//        Thread.sleep(3000);
//
//        homePage.clickOnElement(flightBooking.clickSearchButton);
//        Thread.sleep(3000);


    }
}
