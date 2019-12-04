package steps;

import Pages.ProductPage;
import cucumber.api.java.en.And;

public class ProductPageSteps {
    private ProductPage productPage;

    public ProductPageSteps() {
        this.productPage = new ProductPage();
    }

    @And("^I add ([0-9]+) pieces of product in shopping kart$")
    public void iAddPiecesOfProductInShoppingKart(int quantity) {
        this.productPage.addQuantityInShoppingKart(quantity);
    }

}
