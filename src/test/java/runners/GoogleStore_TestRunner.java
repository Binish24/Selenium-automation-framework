package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (

        features = "src/test/resources/features/NavigateToGoogle_StorePage.feature",
        glue = "stepdefinations"
)

public class GoogleStore_TestRunner extends AbstractTestNGCucumberTests {}
