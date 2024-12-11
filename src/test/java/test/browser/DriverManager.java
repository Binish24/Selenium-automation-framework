package test.browser;

import config.ConfigManager;
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
import org.openqa.selenium.safari.SafariOptions;


public class DriverManager {

    //    public static int addTwoNumbers( int a, int b) {
//        return a + b;
//    }
//
//    public static void printMyName(){
//        System.out.println("Mike");
//    }
    private static WebDriver driver;

//    static {
//        initializeWebDriver("chrome");
//    }

    public static WebDriver initializeWebDriver () {

        Browser browserName = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());
        //since we Browser as enum /enumeration, we have to remove "" marks below from our case "CHROME"/"EDGE" and leave them
        //without " " marks like this case CHROME/EDGE
        ConfigManager.getProperty("isHeadless");
        boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
        System.out.println("isHeadless mode: " +isHeadless);

//        if (browserName.equalsIgnoreCase("chrome")) {
//            return driver = new ChromeDriver();
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            return driver = new FirefoxDriver();
//        }
        //switch is much easier than if statement to read!

        switch (browserName) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (isHeadless) {
                    chromeOptions.addArguments("--headless");
                }
                return driver = new ChromeDriver(chromeOptions);
            //break; // once we use return, in this case we are not going to use break!!!
            //In case we were interested to use the break, then we are going to remove, return and then at the end;
            //driver.manage().window().maximize and then return driver;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (isHeadless) {
                    firefoxOptions.addArguments("--headless");
                }
                return driver = new FirefoxDriver();
            // break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if (isHeadless) {
                    edgeOptions.addArguments("--headless");
                }
                return driver = new EdgeDriver();
            //  break;
//            case "SAFARI":
//                WebDriverManager.safaridriver().setup();
//                SafariOptions safariOptions = new SafariOptions();
//                if (isHeadless) {
//                    safariOptions.addArguments("--headless");
//                }
//                return driver = new SafariDriver();
            //   break;
            default:
                throw new IllegalArgumentException("Invalid browser name");

        }
    }
}
