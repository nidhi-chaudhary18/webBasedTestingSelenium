package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/common/webTestingAmazonProducts.feature",
        glue= "",
        strict = true)
public class RunTests {
}
