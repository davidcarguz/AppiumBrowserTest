package appium.browser.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features"
,glue = "appium.browser.test.stepDefinitions"
,monochrome = true
,snippets = SnippetType.CAMELCASE
)

public class AppiumRunner {

}
