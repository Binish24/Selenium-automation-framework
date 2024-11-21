//package config;
//
//import enums.Browser;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.safari.SafariDriver;
//
//public class DriverFactory {
//
//    public static WebDriver driver;
//
//    public static WebDriver intializWebDriver() {
//
//        Browser browser = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());
//        Boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
//        System.out.println("Loaded configuration on" +isHeadless);
//
//        switch (browser) {
//            case CHROME:
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
//
//                if (isHeadless) {
//                    chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920*1080");
//                    driver = new ChromeDriver(chromeOptions);
//                    break;
//                }
//            case EDGE:
//                WebDriverManager.edgedriver().setup();
//                EdgeOptions edgeOptions = new EdgeOptions();
//                if (isHeadless) {
//                    edgeOptions.addArguments("--headless");
//                }
//                driver = new EdgeDriver(edgeOptions);
//                break;
//
//            case FIREFOX:
//                WebDriverManager.firefoxdriver().setup();
//                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                if (isHeadless) {
//                    firefoxOptions.addArguments("--headless");
//                }
//                driver = new FirefoxDriver(firefoxOptions);
//                break;
//
//            case SAFARI:
//                WebDriverManager.safaridriver().setup();
//                driver = new SafariDriver();
//                break;
//
//            default:
//                throw new IllegalArgumentException("Browser is not supported." + browser);
//
//        }
//        driver.manage().window().maximize();
//        return driver;
//
//    }
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
   //*************************************************\\*****************************************************\\

package config;

import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    // WebDriver instance used across the test execution
    public static WebDriver driver;

    /**
     * Initializes and returns a WebDriver instance based on the configured browser.
     * The browser configuration is retrieved from the ConfigManager.
     * If "isHeadless" is true, the browser will run in headless mode.
     *
     * @return the initialized WebDriver instance for the configured browser
     */
    public static WebDriver initializeWebDriver() {

        // Get the browser type (e.g., CHROME, FIREFOX, EDGE, SAFARI) from the configuration
        Browser browser = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());

        // Get the headless mode flag from the configuration (true or false)
        boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
        System.out.println("Loaded configuration with headless mode: " + isHeadless);

        // Switch between different browser types and set up WebDriver accordingly
        switch (browser) {
            case CHROME:
                // Setup ChromeDriver using WebDriverManager to handle dependencies
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920x1080");
                }
                driver = new ChromeDriver(chromeOptions);  // Instantiate ChromeDriver with the options
                break;

            case FIREFOX:
                // Setup FirefoxDriver using WebDriverManager to handle dependencies
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);  // Instantiate FirefoxDriver with the options
                break;

            case EDGE:
                // Setup EdgeDriver using WebDriverManager to handle dependencies
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    edgeOptions.addArguments("--headless");
                }
                driver = new EdgeDriver(edgeOptions);  // Instantiate EdgeDriver with the options
                break;

            case SAFARI:
                // Setup SafariDriver (no options for headless support)
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();  // Instantiate SafariDriver
                break;

            default:
                // Throw an exception if the specified browser is unsupported
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        // Maximize the browser window to ensure the window size is consistent across tests
        driver.manage().window().maximize();

        // Return the instantiated WebDriver
        return driver;
    }

    /**
     * Quits the current WebDriver instance and closes the browser.
     * This method should be called after the test execution is complete.
     */
    public static void quitDriver() {
        // Only quit if the driver is initialized
        if (driver != null) {
            driver.quit();  // Close the browser and clean up resources
        }
    }
}
