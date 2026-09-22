public class Product {
    private int productId;
    private float productPrice;
    private String productType;

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("Produk Ditambahkan");
    }

    public void modifyProduct(float newPrice, String newType) {
        this.productPrice = newPrice;
        this.productType = newType;
        System.out.println("Produk dimodifikasi");
    }

    public float getProductPrice() {
        return this.productPrice;
    }

    public Product selectProduct(int productId) {
        System.out.println("Mencari produk dengan ID: " + productId);
        return this;
    }

    public String getProductType() {
        return this.productType;
    }
}
