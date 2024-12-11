package base.Examples;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.GoogleWebElements;
import test.browser.Base;

public class NavigateToGoogle_AboutPage extends Base {

    @Before
    //the first setup is the name of out method, we change it to as we wish!
    //the second super.setup is coming from the ConfigManager
    public void setup() {
        super.setup();
    }

    @Given("I am on the google main web page")
    public void I_am_on_the_google_main_web_page() {

    }
    @When("I click on about button")
    public void I_click_on_about_button(){
        GoogleWebElements googleWebElements = new GoogleWebElements(driver);
        googleWebElements.clickOnAboutButton();
    }

    @Then("I should see the about page")
    public void I_should_see_the_about_page() throws InterruptedException {
        Thread.sleep(3000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}
