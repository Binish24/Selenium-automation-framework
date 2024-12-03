package pages.twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {

    WebDriver driver;

    @FindBy(xpath = "//span[text() ='Create account']")
    WebElement createAccount;

    public void homepage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void ClickOnCreateAccountButton() {
        this.createAccount.click();
    }
}
