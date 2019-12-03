package Pages;

import org.openqa.selenium.support.PageFactory;

import utils.ProductDetails;

public class ProductPage extends BasePage {

    public ProductDetails productDetails;
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
}
