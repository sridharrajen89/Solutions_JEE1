package Exercise18;

public class Product {
    private int productId;
    private String productName;
    private int price;
    private int quantityOnHand;

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getReorderQty() {
        return reorderQty;
    }

    public void setReorderQty(int reorderQty) {
        this.reorderQty = reorderQty;
    }

    private int reorderLevel = 10;
    private int reorderQty = 50;

    public Product(int productId, String productName, int price, int quantityOnHand) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
        /*this.reorderLevel = 10;
        this.reorderQty = 50;*/
    }
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (price != product.price) return false;
        if (quantityOnHand != product.quantityOnHand) return false;
        if (reorderLevel != product.reorderLevel) return false;
        if (reorderQty != product.reorderQty) return false;
        return productName != null ? productName.equals(product.productName) : product.productName == null;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + quantityOnHand;
        result = 31 * result + reorderLevel;
        result = 31 * result + reorderQty;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantityOnHand=" + quantityOnHand +
                ", reorderLevel=" + reorderLevel +
                ", reorderQty=" + reorderQty +
                '}';
    }


}
