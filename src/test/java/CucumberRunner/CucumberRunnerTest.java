package CucumberRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   monochrome = true,
                    features = "src/test/resources/features/",
                    glue = "StepDef",
                    plugin = {"pretty","html:target/cucumber-reports"},
                    tags = "@SanityTest1"

)
public class CucumberRunnerTest {
}
