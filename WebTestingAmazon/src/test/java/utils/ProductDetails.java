package utils;

public class ProductDetails {
    private static ProductDetails productDetails;
    public String productName;
    public double productPrice;
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

    public double getTotalPrice() {
        return productPrice * quantity;
    }
}
