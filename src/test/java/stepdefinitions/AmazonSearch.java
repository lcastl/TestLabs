package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import pages.homepage.AmazonHomePage;

import static org.hamcrest.MatcherAssert.assertThat;


public class AmazonSearch {

    @Page
    AmazonHomePage amazonHomePage;

    @Given("that I am at the amazon home page")
    public void thatIAmAtTheAmazonHomePage() {
        amazonHomePage.openHomePage();
    }

    @When("I search for a (.*)$")
    public void iSearchForAProduct(String product) {
        amazonHomePage.searchAmazonProduct(product);
    }

    @When("I click on search button")
    public void iClickOnSearchButton() {
        amazonHomePage.clickOnSearchButton();
    }

    @Then("I verify the list of given products$")
    public void iVerifyTheListOfGivenProducts() {
        assertThat("The expected was not found", amazonHomePage.verifySearchResult());
    }
}
