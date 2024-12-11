package pages.google;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigateToGoogleMainPage {

    private final WebDriver driver;
    public final WebElement signInButton;
   // private final By signInButton;
    public final WebElement useYourGoogleAccount;


    public NavigateToGoogleMainPage(WebDriver driver) {
        this.driver = driver;
        this.signInButton = driver.findElement(By.xpath("//a[@aria-label ='Sign in']"));
       // this.signInButton = By.xpath("//a[@aria-label ='Sign in']");
        this.useYourGoogleAccount = driver.findElement(By.xpath("//span[text() ='Use your Google Account']"));

    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

//    public void clickOnUseYourGoogleAccount () {
//        driver.findElement(By.xpath("//span[text() ='Use your Google Account']")).click();}


}
