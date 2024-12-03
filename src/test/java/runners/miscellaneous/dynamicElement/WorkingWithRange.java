package runners.miscellaneous.dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkingWithRange {

    public static final String inputFieldUrl = "retails.tekschool-student.com/selenium/inputs";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        driver.get(inputFieldUrl);
        wait.until(ExpectedConditions.urlToBe(inputFieldUrl));

        WebElement rangePicker = driver.findElement(By.id("rangeInput"));

        int rangeValue = 25;
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        Thread.sleep(2000);
       // jsExecutor.executeScript("arguments[0].value ='" + rangeValue +"':",rangePicker); because of using for loop, i commanded it!

        for (int i = 0; i <= 25; i ++) {
            jsExecutor.executeScript("arguments[0].value ='" + i +"':",rangePicker);
            Thread.sleep(200);
        }


        Thread.sleep(3000);

        driver.close();
        driver.quit();

    }
}
