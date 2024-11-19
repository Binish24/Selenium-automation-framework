package utils;

import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static Duration getTimeout() {
        String timeoutValue = ConfigManager.getProperty("timeout");
       int timeoutInSeconds = (timeoutValue != null) ? Integer.parseInt(timeoutValue) : 10;
        return Duration.ofSeconds(0);

    }

    public static void applyGlobalWait () throws InterruptedException {

        boolean enableWait = Boolean.parseBoolean(ConfigManager.getProperty("EnableWait"));
        int timeoutsInSecond = Integer.parseInt(ConfigManager.getProperty("waitInSecond"));
        System.out.println("Is wait enable: " + enableWait);
        System.out.println("Time in seconds: " + timeoutsInSecond);

        if (enableWait && timeoutsInSecond > 0) {
            try {
                Thread.sleep(timeoutsInSecond * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Global wait interrupted. " + e.getMessage());
            }


        }


    }

    public static WebElement applyWait (WebDriver driver, WebElement webElement, WaitStrategy waitStrategy, By element) {
        WebDriverWait wait = new WebDriverWait(driver,getTimeout());

        switch (waitStrategy) {
            case CLICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(webElement));
            case VISIBLE:
                return wait.until(ExpectedConditions.visibilityOf(webElement));
            case NONE:;
            default:
                return webElement;
        }
    }

    public static WebElement waitForPresence (WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver,getTimeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));

    }


}
