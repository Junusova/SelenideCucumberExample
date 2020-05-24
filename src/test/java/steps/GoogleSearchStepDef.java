package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchStepDef {

  @Given("Open browser with google.com")
  public void openGoogleSearch() {
    Configuration.reportsFolder = "target/surefire-reports";
    open("https://google.com");
  }

  @When("A keyword {string} was entered in input field")
  public void enterKeyword(String keyword) {
    $(By.name("q")).val(keyword).pressEnter();
  }

  @Then("At least top {string} matches should be shown")
  public void topTenMatchesShouldBeShown(int resultsCount) {
    $$("#res .g").shouldHave(sizeGreaterThanOrEqual(resultsCount));
  }

  @Then("The first one should be consist {string}")
  public void theFirstOneShouldContainKeyword(String expectedText) {
    $("#res .g").shouldHave(text(expectedText));
  }
}
