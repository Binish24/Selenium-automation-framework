package test.browser;


import enums.WaitStrategy;
import org.testng.annotations.Test;
import pages.google.LandingPage;

public class NavigateToGoogle extends Base {

    //LandingPage landingPage = new LandingPage(driver);

    @Test
    public void NavigateToAboutPageTest() {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.applyWait(driver,landingPage.aboutButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnAboutButton();
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
       WaitUtils.globalWait();
    }

    @Test
    public void NavigateToStorePageTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.waitForPresence(driver,landingPage.gmailButton);
        WaitUtils.applyWait(driver, landingPage.storeButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnStoreButton();
        WaitUtils.globalWait();

    }

    public void NavigateToAboutTwoPageTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.applyWait(driver,landingPage.aboutButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnAboutButton();
        WaitUtils.globalWait();

    }
}
