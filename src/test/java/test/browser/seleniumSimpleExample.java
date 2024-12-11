package test.browser;


import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import pages.google.LandingPage;


public class seleniumSimpleExample extends Base{

    @Test
    public void simpleTest() {

        LandingPage landingPage = new LandingPage(driver);
        driver.manage().window().maximize();
        WaitUtils.applyWait(driver,landingPage.aboutButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnAboutButton();
        WaitUtils.globalWait();
        //Thread.sleep(3000); when we are going to use globalWait, we are not going to use the Thread.sleep(); more!


    }


}
