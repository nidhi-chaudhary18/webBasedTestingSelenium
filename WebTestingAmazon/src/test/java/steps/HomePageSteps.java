package steps;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import cucumber.api.java.en.When;
import hooks.DriverSetup;
import commons.Wait;
import cucumber.api.java.en.Given;

public class HomePageSteps {
   private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateToAWebPageWithGivenURL(String strURL) {
        this.homePage.goToHomePage();
    }

    @When("^I go to \"([^\"]*)\"$")
    public void iGoToSpecifiedScetionOnHomePage (String strSectionName){
    this.homePage.verifySectionLinkOnHomePage(strSectionName);
    }
}
