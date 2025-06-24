package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TicketBookingPage extends DriverSetup {

    @Test
    public void openPage(){
        ShareTrip.get("https://sharetrip.net/");

    }

}

