package Pages;

import Configuration.DriverSetup;
import org.testng.annotations.Test;

public class LoginPage extends DriverSetup {
    @Test
    public void login(){
        getShareTrip().get("https://sharetrip.net/login");
    }
}
