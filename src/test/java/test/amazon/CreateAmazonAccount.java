package test.amazon;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccount extends BaseTest {

    @Test

    public void createAccount() {

        //AAA
        //ARRANGE
        //ACT
        //ASSERT

        Dashboard_PF dashboardPf = new Dashboard_PF(driver); /// we can omited the first"Dashboard_PF and use "var" instead
        //var dashboard = new Dashboard_PF(driver);
        SignInPage_PF signInPagePf = new SignInPage_PF(driver);
        CreateYourAmazonAccount_PF createYourAmazonAccount_PF= new CreateYourAmazonAccount_PF(driver);


        dashboardPf.clickOnSignInButton();
        WaitUtils.applyGlobalWait();

        signInPagePf.clickOnCreateYourAmazonAccountButton();
        WaitUtils.applyGlobalWait();

        createYourAmazonAccount_PF.enterYourName("Michel Jackson");
        createYourAmazonAccount_PF.enterMobileNumberOrEmail("benish.ranna@gmail.com");
        //createYourAmazonAccount_PF.enterPhoneNumberOrEmail(243242423);
        createYourAmazonAccount_PF.enterPassword("benish123");
        createYourAmazonAccount_PF.reEnterPassword("benish123");
        createYourAmazonAccount_PF.verifyEmailButton();


        WaitUtils.applyGlobalWait();



    }

}
