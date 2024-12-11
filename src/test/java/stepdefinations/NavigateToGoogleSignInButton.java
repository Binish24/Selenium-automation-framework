package stepdefinations;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.log4testng.Logger;
import pages.google.NavigateToGoogleMainPage;
import test.browser.Base;
import test.browser.WaitUtils;


public class NavigateToGoogleSignInButton extends Base {

    NavigateToGoogleMainPage navigateToGoogleMainPage;

    private static final Logger log =Logger.getLogger(NavigateToGoogleSignInButton.class);

@Before
public void setup() {
    super.setup();
    this.navigateToGoogleMainPage = new NavigateToGoogleMainPage(driver);

}
    @Given("The user is on the google web page")
    public void The_user_is_on_the_google_web_page(){
    }

    @When("The user click on signIn page")
    public void The_user_click_on_signIn_page() {

      WaitUtils.globalWait();
      navigateToGoogleMainPage.clickOnSignInButton();
      WaitUtils.globalWait();
    }

    @Then("The user should see Use your Google Account text on signIn page")
    public void The_user_should_see_use_your_google_Account_text_on_signIn_page()  {

        String actualText = navigateToGoogleMainPage.useYourGoogleAccount.getText();
        String expectedText ="Use you Google Account ";
        Assert.assertEquals(actualText,expectedText,"The text does not match.");
    }

    @After
    public void tearDown() {
    super.tearDown();
    }


}
