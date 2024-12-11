package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features/Google/NavigateToGoogleSignInPage.feature",
        glue = "stepdefinations"
)

public class SignInRunner extends AbstractTestNGCucumberTests {


}
