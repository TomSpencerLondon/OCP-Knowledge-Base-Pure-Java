import cucumber.api.CucumberOptions; import cucumber.api.junit.Cucumber; import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:out.html"}, glue="nicebank",
features ="src/test/resources/nicebank")
public class RunCukesTest { }