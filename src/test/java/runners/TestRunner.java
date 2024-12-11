package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = "src/test/resources/features/amazon/CreateAccount.feature",
        //features ="src/test/resources/features",
        //features ="src/test/resources/features/amazon",

        glue ="stepdefinations"
)

public class TestRunner extends AbstractTestNGCucumberTests {




}
