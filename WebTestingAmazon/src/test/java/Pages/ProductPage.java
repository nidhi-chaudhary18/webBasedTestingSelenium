package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.ProductDetails;

public class ProductPage extends BasePage {

    public ProductDetails productDetails;
    @FindBy(xpath = "//span[contains(@id,'productTitle')]")
    private WebElement productName;

    @FindBy(xpath = "//span[@id='price_inside_buybox']")
    private WebElement productPrice;

    @FindBy(xpath = "//select[@name='Quantity']")
    private Select productQuantitydropdown;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void addQuantityInShoppingKart(int iQuantity) {
        saveProductDetails(iQuantity);
        this.productQuantitydropdown.selectByIndex(iQuantity);
        this.addToCartButton.click();
    }

    public void saveProductDetails(int quantity) {
        productDetails = ProductDetails.getInstance();
        productDetails.productPrice = Integer.parseInt(this.productPrice.getText());
        productDetails.productName = this.productName.getText();
        productDetails.quantity = quantity;

    }
}
