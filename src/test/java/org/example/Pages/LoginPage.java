package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.testng.annotations.Test;

public class LoginPage extends DriverSetup {
    @Test
    public void login(){
        ShareTrip.get("https://sharetrip.net/login");
    }
}
