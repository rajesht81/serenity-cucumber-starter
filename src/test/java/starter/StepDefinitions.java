package starter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import starter.googleSearchPage;

public class StepDefinitions {
    googleSearchPage gPage;

    @Given("^I am on Google Page$")
    public void i_am_on_google_page() throws Throwable {
        gPage.openGoogle();
    }

    @When("^I should be able to search for (.*)$")
    public void i_should_be_able_search(String searchText) throws Throwable {
        gPage.search(searchText);
    }

}
