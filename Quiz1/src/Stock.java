public class Stock {
    private int quantity;
    private int shopNo;

    private Product product;

    public Stock(int quantity, int shopNo, Product product) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.product = product;
    }

    public void addStock() {
        System.out.println("Stok sejumlah: " + quantity + " ditambahkan untuk toko " + shopNo);
    }

    public void modifyStock(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("Stok produk " + product.getProductType() + " di toko " + this.shopNo + " diubah menjadi: "
                + this.quantity);
    }

    public Stock selectStockItem(int productId) {
        System.out.println("Mengambil item stok untuk produk ID: " + productId);
        return this;
    }
}
