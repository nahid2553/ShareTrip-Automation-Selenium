package Pages;

import Configuration.DriverSetup;
import org.testng.annotations.Test;

public class SignUpPage extends DriverSetup {
    @Test
    public void signUp(){
        getShareTrip().get("https://sharetrip.net/signup");

    }
}
