package utils;

public class ProductDetails {
    private static ProductDetails productDetails;
    public String productName;
    public int productPrice;
    public int quantity;
    public int totalPrice;

    private ProductDetails() {
    }

    public static ProductDetails getInstance() {
        if (productDetails == null) {
            productDetails = new ProductDetails();
        }
        return productDetails;
    }

    public int getTotalPrice() {
        return productPrice*quantity;
    }
}
