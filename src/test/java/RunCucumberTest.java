import com.codeborne.selenide.junit.TextReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class RunCucumberTest {

    @Rule
    public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);
}
