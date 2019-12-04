package Pages;

import org.junit.Assert;
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

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement productQuantitydropdown;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void addQuantityInShoppingKart(int iQuantity) {
        saveProductDetails(iQuantity);
        Select quantity = new Select(this.productQuantitydropdown);
        Assert.assertTrue("Required Quantity is not left for this product", quantity.getOptions().size() >= iQuantity);
        quantity.selectByValue(String.valueOf(iQuantity));
        this.addToCartButton.click();
    }

    public void saveProductDetails(int quantity) {
        productDetails = ProductDetails.getInstance();
        productDetails.productPrice = Double.parseDouble(this.productPrice.getText().replace("$", ""));
        productDetails.productName = this.productName.getText();
        productDetails.quantity = quantity;

    }
}
