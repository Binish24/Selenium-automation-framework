package runners.miscellaneous.dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateInput {

//    public static final String inputFieldUrl = "retails.tekschool-student.com/selenium/inputs";
//
//    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        Actions action = new Actions(driver);
//
//        driver.get(inputFieldUrl);
//        wait.until(ExpectedConditions.urlToBe(inputFieldUrl));
//
//        WebElement dateInput = driver.findElement(By.id("dateInput"));
//
//        ///action.click(dateInput).perform();
//
////        String customDate = "2023/12/23"; we have to care about the date format!
////        dateInput.sendKeys(customDate);
//
//        LocalDate today = LocalDate.now();
//        String correctedDateFormat = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
//        Thread.sleep(2000);
//        action.click (dateInput).sendKeys(correctedDateFormat).perform();
//
//        Thread.sleep(2000);
//
//        String customDate = "10/15/2000";
//        dateInput.clear();
//        Thread.sleep(2000);
//       //dateInput.sendKeys(customDate);
//        action.click (dateInput).sendKeys(customDate).perform();
//
//        Thread.sleep(3000);
//
//        driver.close();
//        driver.quit();
//    }

    public static final String dateUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_date";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        driver.get(dateUrl);
        wait.until(ExpectedConditions.urlToBe(dateUrl));

        WebElement birthday = driver.findElement(By.xpath("//input[@id ='birthday"));

        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.xpath("//input[@type ='submit']"));
        action.click(submit).perform();

        Thread.sleep(2000);

        //action.click(birthday).perform();

        LocalDate today = LocalDate.now();
        String correctedDateFormat = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        Thread.sleep(2000);
        action.click (birthday).sendKeys(correctedDateFormat).perform();

        Thread.sleep(2000);

        String customDate = "10/15/2000";
        birthday.clear();
        Thread.sleep(2000);
        action.click (birthday).sendKeys(customDate).perform();


        Thread.sleep(3000);

        driver.close();

        driver.quit();







    }

}
