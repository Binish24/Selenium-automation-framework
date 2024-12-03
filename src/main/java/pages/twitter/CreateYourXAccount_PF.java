package pages.twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourXAccount_PF {

    WebDriver driver;

    @FindBy (xpath = "//input[contains(@class, 'r-30o5oe r-1dz5y72 r-13qz1uu r-1niwhzg r-17gur6a')]")
    WebElement enterName;

    @FindBy(name = "phone_number")
    WebElement enterPhoneNumber;

    @FindBy(xpath = "//div[contains(@class, 'r-kemksi r-16xksha r-1a11zyx')]")
    WebElement DateOfBirth_Month;

    @FindBy(xpath = "//div[contains(@class, 'r-16y2uox r-1a11zyx')]")
    WebElement DateOfBirth_Day;

    @FindBy(xpath = "//div[@class='css-175oi2r r-1roi411 r-z2wwpe r-rs99b7 r-kemksi r-16y2uox']")
    WebElement DateOfBirth_Year;

    @FindBy(xpath = "//div[contains(@class,'r-6koalj r-18u37iz r-16y2uox r-1777fci')]")
    WebElement nextButton;

    public void CreateYourXAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterName (String Name) {
        this.enterName.sendKeys("Name");
    }

    public void enterPhoneNumber(int phoneNumber) {

        this.enterPhoneNumber.sendKeys("phoneNumber");
    }

    public void DateOfBirth_Month (String month) {

        this.DateOfBirth_Month.sendKeys("month");
    }

    public void DateOfBirth_Day(int num1) {

        this.DateOfBirth_Day.sendKeys("number");
    }

    public void DateOfBirth_Year (int num2) {
        this.DateOfBirth_Year.sendKeys("num2");
    }

    public void nextButton () {
        this.nextButton.click();
    }

}
