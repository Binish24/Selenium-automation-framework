package runners.miscellaneous.week_4.day_3.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static week_4.day_2.activities.ActivityOne.action;
import static week_4.day_2.activities.ActivityOne.wait;

public class FirstActivity {


    /* Navigate to "https://wwww.amazon.com"
     * Move the mouse to "Hello, Sign In Account & Lists"
     * Click on Sign In button
     * Navigate to login page and verify that the user is on the login page
     * Try to use Xpath
     */

    /* Urls */
    public static final String amazonUrl ="https://www.amazon.com/";
    public static final String amazonLoginPageXpath="https://www.amazon.com/ap/signin";

    /* Main page */
    public static final String helloSignInXpath ="//span[text() ='Hello, sign in']";
    public static final String signInButtonXpath ="//span[text() ='Sign in']";

    /* Login page */
    public static final String emailInputFieldXpath ="//input[@id='ap_email']";



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to Amazon.com
        driver.get(amazonUrl);
        wait.until(ExpectedConditions.urlToBe(amazonUrl));

        //Locate hello sign in button
        WebElement helloSignInButton = driver.findElement(By.xpath("signInButtonXpath"));
        wait.until(ExpectedConditions.elementToBeClickable(helloSignInButton));

        //Hover the mouse onto this button
        action.moveToElement(helloSignInButton).perform();

        //Locate and click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("helloSignInXpath"));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));

        //Click on signIn button

        action.click(signInButton).perform();

        //Locate and verify that we can interact with the email field
        WebElement emailInputField = driver.findElement(By.xpath("emailInputFieldXpath"));
        wait.until(ExpectedConditions.urlContains(amazonLoginPageXpath));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));



        Thread.sleep(3000);

        driver.close();
        driver.quit();


    }


}
