package steps;

import Pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShoppingCartPageSteps {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageSteps() {
      this.shoppingCartPage = new ShoppingCartPage();
    }

    @Then("^I open shopping kart$")
    public void iOpenShoppingKart() {
        this.shoppingCartPage.ClickOnOpenCartButton();
    }

    @And("^I validate the same product is added$")
    public void iValidateTheSameProductIsAdded() {
        this.shoppingCartPage.verifyProductNameAndPrice();
    }

    @And("^I validate sum is correct$")
    public void iValidateSumIsCorrect() {
        this.shoppingCartPage.verifyProductTotalPrice();
    }
}
