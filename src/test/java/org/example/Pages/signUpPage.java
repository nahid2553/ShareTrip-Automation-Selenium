package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.testng.annotations.Test;

public class signUpPage extends DriverSetup {
    @Test
    public void signUp(){
        getShareTrip().get("https://sharetrip.net/signup");

    }
}
