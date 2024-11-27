package pages.amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourAmazonAccount_PF {

    WebDriver driver;

@FindBy (id = "ap_customer_name")
    WebElement yourName;

@FindBy (xpath = "//input[@id='ap_email']")
WebElement PhoneNumberOrEmail;

@FindBy(xpath = "//input[@id ='ap_password']")
WebElement password;


@FindBy(xpath = "//input[@id='ap_password_check']")
WebElement Re_enter_Password;


@FindBy(xpath = "//input [@id ='continue']")
WebElement verify_email;

public CreateYourAmazonAccount_PF (WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void enterYourName (String yourName) {

    this.yourName.sendKeys("yourName");
}

public void enterPhoneNumberOrEmail(String email) {
    this.PhoneNumberOrEmail.sendKeys("email");
}

public void enterPhoneNumberOrEmail(int phoneNumber) {
        this.PhoneNumberOrEmail.sendKeys("phoneNumber");
    }

public void password (String pass) {

    this.password.sendKeys("passs");
}

public void setRe_enter_Password (String re_enter_password) {

    this.Re_enter_Password.sendKeys("re_enter_password");
}

public void verify_email () {
    this.verify_email.click();
}

}
