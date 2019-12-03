package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ProductDetails;

public class ShoppingCartPage extends BasePage {

    ProductDetails productDetails = ProductDetails.getInstance();
    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//span[contains(@class,'a-size-medium sc-product-title a-text-bold')]")
    private WebElement productTitleOnCartPage;

    @FindBy(xpath = "//span[@id='sc-subtotal-label-activecart']")
    private WebElement productQuantityOnCartPage;

    @FindBy(xpath = "//*[@id='sc-subtotal-amount-activecart']")
    private WebElement productTotalPriceOnCartPage;

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickOnOpenCartButton() {
        this.waitVisibility(By.xpath(String.valueOf(viewCartButton)));
        this.viewCartButton.click();
        this.waitVisibility(By.xpath(String.valueOf(productTitleOnCartPage)));
    }

    public void verifyProductNameAndPrice(){
        String expectedProductName = productDetails.productName;
        String expectedQuantity = String.valueOf(productDetails.quantity)+" items";
        Assert.assertTrue("Expected Product Name is " + expectedProductName + " instead of " + this.productTitleOnCartPage.getText(),
                this.productTitleOnCartPage.getText().equals(expectedProductName));
        Assert.assertTrue("Expected Quantity is "+expectedQuantity+" instead of "+this.productQuantityOnCartPage.getText() ,this.productQuantityOnCartPage.getText().contains(expectedQuantity));

    }

    public void verifyProductTotalPrice(){
        String expectedTotalPrice = "$"+String.valueOf(productDetails.getTotalPrice());
        Assert.assertTrue("Total Price expected is "+expectedTotalPrice+ " instead of " + this.productTotalPriceOnCartPage.getText(),this.productTotalPriceOnCartPage.getText().contains(expectedTotalPrice));
    }
}
