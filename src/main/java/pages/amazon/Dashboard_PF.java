package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_PF {

    WebDriver driver;

    public final WebElement signIn;


 // constructor to initialize the WebDriver
    public Dashboard_PF(WebDriver driver) {
        this.driver= driver;
        //Manually locating the element
        this.signIn=driver.findElement(By.xpath( "//span[text() ='Hello, sign in']")); // this means, this  current page and all elements/ Dashboard class
    }

    //Actions for elements   (for this purpose we are going to create a method!)
    public void clickOnSignInButton () {
         this.signIn.click();

    }


    }
