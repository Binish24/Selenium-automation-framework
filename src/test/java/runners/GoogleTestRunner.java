package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resource/features",
        //NavigateToGoogle_AboutPage.features is more specific address
        glue = "stepdefinations"
)

public class GoogleTestRunner extends AbstractTestNGCucumberTests {



}
