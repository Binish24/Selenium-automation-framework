package test.browser;

import config.ConfigManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    public WebDriver driver;
    private final String baseUrl = ConfigManager.getProperty("baseUrl");
    private final Logger logger = LogManager.getLogger(this); /// Base.class /this is coming from this class

    @BeforeMethod
    public void setup() {

        driver = DriverManager.initializeWebDriver();
        driver.get(baseUrl);
      //  System.out.println("Navigating to URL: " + baseUrl); in the future, it is preferred to use from logger than sout!
        logger.info("Navigating to URL: " +baseUrl);
    }


    @AfterMethod
    public void tearDown () {
        if ( driver != null) {
            driver.quit();
          //  System.out.println("Instance of browser is quit!");
            logger.info("Driver instance is quit after the test.");
        }
    }
}
