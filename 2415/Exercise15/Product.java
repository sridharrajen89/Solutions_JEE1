package Exercise15;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private int productPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    public Product(int productId, String productName, int productPrice) {

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (productPrice != product.productPrice) return false;
        return productName != null ? productName.equals(product.productName) : product.productName == null;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + productPrice;
        return result;
    }

    @Override
    public String toString() {
        return "Exercise15.Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(@NotNull Product p) {
        return p.productId-this.productId;
    }

}
