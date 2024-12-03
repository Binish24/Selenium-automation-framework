package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_PF {

    WebDriver driver;


 @FindBy(xpath = "//span[text() ='Hello, sign in']")
    WebElement signIn;

 //create constructor
    public Dashboard_PF(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this); // this means, this  current page and all elements/ Dashboard class
    }

    //Actions for elements   (for this purpose we are going to create a method!)
    public void clickOnSignInButton () {
         this.signIn.click();

    }


    }
