package stepdefinations;


import base.BaseTest;
import config.ConfigManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccountSteps extends BaseTest {


    Dashboard_PF dashboardPf = new Dashboard_PF(driver);
    SignInPage_PF signInPagePf = new SignInPage_PF(driver);
    CreateYourAmazonAccount_PF createYourAmazonAccountPf= new CreateYourAmazonAccount_PF(driver);


@Before
    public void setupDriver () {
    setup();
    this.dashboardPf = new Dashboard_PF(driver);
    this.signInPagePf = new SignInPage_PF(driver);
    this.createYourAmazonAccountPf=new CreateYourAmazonAccount_PF(driver);
}

    @Given("I am on the amazon web page")
            public void I_am_on_the_amazon_web_page() {}     //{driver.get(ConfigManager.getProperty("baseUrl"));}

    @When (" I click on sign in button")
        public void I_click_on_sign_in_button () {
         dashboardPf.clickOnSignInButton();
    }

    @And("I click on Create amazon account button")
        public void I_click_on_Create_amazon_account_button () {
    signInPagePf.clickOnCreateYourAmazonAccountButton();
    }

    @And("I enter username as value for your name field")
         public void I_enter_username_as_value_for_your_name_field (){
         createYourAmazonAccountPf.enterYourName("Benish");
    }

    @And("I enter phone number as a value for Mobile number or email field")
    public void I_enter_phone_number_as_a_value_for_Mobile_number_or_email_field(){
    createYourAmazonAccountPf.enterMobileNumberOrEmail("4234234921");
    }

    @And("I enter password as valid password value for password field")
    public void I_enter_password_as_valid_password_value_for_password_field () {
    createYourAmazonAccountPf.enterPassword("32131233123");
    }

    @And("I re-enter password as valid password value in Re-enter password field")
    public void I_re_enter_password_as_valid_password_value_in_Re_enter_password_field () {
        createYourAmazonAccountPf.enterPassword("32131233123");
    }

    @And("I click on verify phone number button")
    public void I_click_on_verify_phone_number_button() {
    createYourAmazonAccountPf.verifyEmailButton();
    }

    @After
    public void tearDownDriver () {
    tearDown();
    }

}





