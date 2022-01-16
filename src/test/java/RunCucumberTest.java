import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/",
        tags ="@RegressionPack",
        format = {"pretty", "html:target/destination"})

public class RunCucumberTest {
}
