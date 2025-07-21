package Pages;

import Configuration.DriverSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends DriverSetup {
    private WebDriver driver;
    private JavascriptExecutor js;
    FlightBooking flightBooking = new FlightBooking();
  //  public String BASE_URL = "https://sharetrip.net/";

    public WebElement getElement(By locator){
        return getShareTrip().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void clickDropdownElement(By  locator) throws InterruptedException {
        Actions actions = new Actions(getShareTrip());
        actions.sendKeys(Keys.ENTER).build().perform();
      //  Thread.sleep(1000);
    }

    public void writeOnElement1(By locator){
        getElement(locator).sendKeys("Dhaka");
    }

    public void writeOnElement2(By locator){
        getElement(locator).sendKeys("Cox's Bazar");
    }

    public void scrollDown(int pixels) {
        try {
            ((JavascriptExecutor) getShareTrip())
                    .executeScript("window.scrollBy({top: arguments[0], left: 0, behavior: 'smooth'})", pixels);
        } catch (Exception e) {
            new Actions(getShareTrip())
                    .scrollByAmount(0, pixels)
                    .perform();
        }
    }


}
