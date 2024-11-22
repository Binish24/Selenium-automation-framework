package pages.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage_PF {

    public WebDriver driver;

    @FindBy(id ="email")
   public WebElement emailInput;

    @FindBy(id ="pass")
    public WebElement passwordInput;

    public FacebookLoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name ="login")
    public WebElement loginButton;

    //Actions

    public void enterEmailAddress (String email) {

        this.emailInput.sendKeys(email);
    }

    public void enterPassword (String password) {
        this.passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton () {
        this.loginButton.click();
    }
}


