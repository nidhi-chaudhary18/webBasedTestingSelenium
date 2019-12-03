package utils;


public class ProductDetails {
    private String productName;
    private int productPrice;

    private ProductDetails(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }
    private ProductDetails(){

    }
}
