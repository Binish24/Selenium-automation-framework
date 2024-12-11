package base.Examples;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.browser.Base;


public class Grab_and_Print_the_commitment_text extends Base {

    @Before
    public void setup() {
        super.setup();
    }

    @Given("I am on the google main web page")
    public void I_am_on_the_google_main_page(){
    }

    @When("I click on about button")
    public void I_click_on_about_button() {

    }

    @And("I click on commitment button")
    public void I_click_on_commitment_button(){

    }

    @And("I grab the text on the commitment page")
    public void I_grab_the_text_on_the_commitment_page(){

    }

    @Then("I should on the commitment page")
    public void I_should_on_the_commitment_page(){

    }
}
