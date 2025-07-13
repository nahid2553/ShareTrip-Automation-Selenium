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
        homePage.clickOnElement(flightBooking.oneWayTrip);
        homePage.scrollDown(300);
        Thread.sleep(3000);

        homePage.clickOnElement(flightBooking.departureAirport);
        homePage.clickOnElement(flightBooking.departureAirportCross);
        homePage.writeOnElement1(flightBooking.departureAirportName);
        homePage.clickDropdownElement(flightBooking.selectDepartureAirport);

        homePage.clickOnElement(flightBooking.destinationAirportCross);
        homePage.writeOnElement2(flightBooking.destinationAirportName);
        homePage.clickDropdownElement(flightBooking.selectDestinationAirport);

        homePage.clickOnElement(flightBooking.clickFirstFlightDate);
    /*    homePage.clickDropdownElement(flightBooking.changeMonth);
        Thread.sleep(5000);  */
        homePage.clickOnElement(flightBooking.selectFlightDate);

        homePage.clickOnElement(flightBooking.clickOnTraveller);
        homePage.clickOnElement(flightBooking.addAdultsTraveller);
        Thread.sleep(3000);
        homePage.clickOnElement(flightBooking.addChildrenTraveller);
        Thread.sleep(3000);
        homePage.clickOnElement(flightBooking.addKidsTraveller);
        Thread.sleep(3000);
        homePage.clickOnElement(flightBooking.addInfantsTraveller);
        Thread.sleep(3000);
        homePage.clickOnElement(flightBooking.clickDoneForTraveller);

        homePage.clickOnElement(flightBooking.clickTravelClassWhenEconomyIsSelected);
        homePage.clickOnElement(flightBooking.selectFirstClassTravel);
        homePage.clickOnElement(flightBooking.clickSearchButton);
        Thread.sleep(3000);

        homePage.clickOnElement(flightBooking.clickModifySearch);
        homePage.clickOnElement(flightBooking.clickTravelClassWhenFirstClassIsSelected);
        homePage.clickOnElement(flightBooking.selectBusinessClassTravel);
        homePage.clickOnElement(flightBooking.clickSearchButton);
        Thread.sleep(3000);

        homePage.clickOnElement(flightBooking.clickModifySearch);
        homePage.clickOnElement(flightBooking.clickTravelClassWhenBusinessClassIsSelected);
        homePage.clickOnElement(flightBooking.selectPremiumEconomyClassTravel);
        homePage.clickOnElement(flightBooking.clickSearchButton);
        homePage.scrollDown(300);
        Thread.sleep(3000);

        homePage.clickOnElement(flightBooking.clickModifySearch);
        homePage.clickOnElement(flightBooking.clickTravelClassWhenPremiumEconomyClassIsSelected);
        homePage.clickOnElement(flightBooking.selectEconomyClassTravel);
        homePage.clickOnElement(flightBooking.clickSearchButton);
        Thread.sleep(3000);
        homePage.scrollDown(300);
        Thread.sleep(3000);
        homePage.scrollDown(300);
        Thread.sleep(3000);
    }

//    @Test
//    public void bookRoundTripFlight() throws InterruptedException {
//        getShareTrip().get(homePage.homePageUrl);
//        homePage.scrollDown(300);
//        Thread.sleep(3000);
//
//        homePage.clickOnElement(flightBooking.departureAirport);
//        homePage.clickOnElement(flightBooking.departureAirportCross);
//        homePage.writeOnElement1(flightBooking.departureAirportName);
//        homePage.clickDropdownElement(flightBooking.selectDepartureAirport);
//
//        homePage.clickOnElement(flightBooking.destinationAirportCross);
//        Thread.sleep(5000);
//        homePage.writeOnElement2(flightBooking.destinationAirportName);
//        Thread.sleep(5000);
//        homePage.clickDropdownElement(flightBooking.selectDestinationAirport);
//
//        homePage.clickOnElement(flightBooking.clickFirstFlightDate);
//        homePage.clickOnElement(flightBooking.selectFlightDate);


//    }
}
