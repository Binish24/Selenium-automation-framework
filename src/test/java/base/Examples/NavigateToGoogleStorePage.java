package base.Examples;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.GoogleWebElements;
import test.browser.Base;

public class NavigateToGoogleStorePage extends Base {

    GoogleWebElements googleWebElements; //instance variable

    @Before
    public void setup() {
        super.setup();
        this.googleWebElements = new GoogleWebElements(driver);
    }

    @Given("I am on the google main web page")
    public void I_am_on_the_google_main_web_page() {

    }

    @When("I click on store button")
    public void I_click_on_store_button() {
        googleWebElements.clickOnStoreButton();
    }

    @Then("I should see the store page")
    public void I_should_see_the_store_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}



