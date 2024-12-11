package test.browser;

import org.testng.annotations.Test;
import pages.google.GoogleWebElements;

public class AccessToWebElements extends Base {

    @Test
    public void accessToAboutButtonTest () throws InterruptedException {
        GoogleWebElements googleWebElements = new GoogleWebElements(driver);
        Thread.sleep(2000);
        googleWebElements.clickOnAboutButton();
        Thread.sleep(2000);
    }

    @Test
    public void accessToStoreButtonTest () throws InterruptedException {
        GoogleWebElements googleWebElements = new GoogleWebElements(driver);
        Thread.sleep(2000);
        googleWebElements.clickOnStoreButton();
        Thread.sleep(2000);
    }

    @Test
    public void accessToGmailButtonTest() throws InterruptedException {
        GoogleWebElements googleWebElements = new GoogleWebElements(driver);
        Thread.sleep(2000);
        googleWebElements.clickOnGmailButton();
        Thread.sleep(2000);
    }

    @Test
    public void accessToImagesButton() throws InterruptedException {
        GoogleWebElements googleWebElements = new GoogleWebElements(driver);
        Thread.sleep(2000);
        googleWebElements.clickOnImagesButton();
        Thread.sleep(2000);
    }


}
