package test.facebook;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Facebook.FacebookLoginPage_PF;
import utils.WaitUtils;

public class FacebookMainTest extends BaseTest {

    @Test
    public void enterEmailAndPassword() {

        FacebookLoginPage_PF facebookLoginPagePf = new FacebookLoginPage_PF(driver);
        String expectedUrl = "https://www.facebook.com/";
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, currentUrl, "User did not navigated to correct Url");

        facebookLoginPagePf.enterEmailAddress("benish.ranna@gmail.com");
        WaitUtils.applyGlobalWait();

        facebookLoginPagePf.enterPassword("Benish123@");
        WaitUtils.applyGlobalWait();

        facebookLoginPagePf.clickOnLoginButton();
        WaitUtils.applyGlobalWait();
    }

}
