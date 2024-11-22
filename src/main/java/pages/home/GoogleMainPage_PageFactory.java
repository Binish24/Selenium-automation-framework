package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage_PageFactory {

    public WebDriver driver;

    //WebElements  //to locate your elements, you can use annotation. for example :

    @FindBy(xpath = "//a[text ='About']") // this called page factory
      public static WebElement aboutButton;

    @FindBy(xpath = "//a[text() = 'Store']")
      public WebElement storeButton;

        public GoogleMainPage_PageFactory(WebDriver driver) {
            this.driver =driver;
           // this.aboutButton =  driver.findElement(
            // By.xpath("//a[text ='About']")); once we created @Findby, then we don't this initialization.
            PageFactory.initElements(driver, this); //PageFactory.initElements(driver, page:this);
        }

        public static void clickOnAboutButton() {
            aboutButton.click();
        }

    }
