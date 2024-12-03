package pages.amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourAmazonAccount_PF {


    WebDriver driver;

    @FindBy(xpath = "//input[@id ='ap_customer_name']")
    WebElement yourName;

    @FindBy(xpath = "//input[@id ='ap_email']")
    WebElement mobileNumberOrEmail;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id ='ap_password_check']")
    WebElement re_enter_password;

    @FindBy(xpath = "//input[@class ='a-button-input']")
    WebElement verifyEmail;

    public CreateYourAmazonAccount_PF (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterYourName(String yourName) {
        this.yourName.sendKeys(yourName);
    }

    public void enterMobileNumberOrEmail (String mobileNumberOrEmail){
        this.mobileNumberOrEmail.sendKeys(mobileNumberOrEmail);
    }

     // public void enterMobileNumberOrEmail (int phoneNumber){
     //    this.phoneNumber.sendKeys(Integer.toString(phoneNumber));
     // }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void reEnterPassword (String re_enter_password) {
        this.re_enter_password.sendKeys(re_enter_password);
    }
    public void verifyEmailButton(){
        this.verifyEmail.click();
    }

}
