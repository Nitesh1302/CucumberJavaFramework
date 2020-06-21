package cucumber.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources/features",
    plugin={"pretty",
        "html:target/cucumber-report/runwebat",
        "junit:target/cucumber-report/cucumber.xml",
        "json:target/cucumber-report/cucumber.json"},
    glue = "stepDefinations")
public class TestRunner{

}