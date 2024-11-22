package test.base;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.GoogleMainPage;
import pages.home.GoogleMainPage_PageFactory;
import utils.WaitUtils;

import static enums.WaitStrategy.CLICKABLE;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest () {

        String expectedUrl ="https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        WaitUtils.applyGlobalWait();

        Assert.assertEquals(actualUrl, expectedUrl,"Failed");


    }

    @Test
    public void myBrowserTestTwo() throws InterruptedException {
        // GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        GoogleMainPage_PageFactory googleMainPage_pageFactory = new GoogleMainPage_PageFactory(driver);

        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct Url.");

        WaitUtils.applyWait(driver,googleMainPage_pageFactory.aboutButton, CLICKABLE);

        logger.info(("Validated the explicit wait on about button"));

        GoogleMainPage_PageFactory.clickOnAboutButton();

        WaitUtils.applyGlobalWait();

        Assert.assertEquals(actualUrl, expectedUrl,"Failed");


    }
}
