import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private float amount;
    private Date orderDate;

    private Customer customer;
    private List<Product> products;

    public Order(int orderId, float amount, Date orderDate, Customer customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProductToOrder(Product product) {
        this.products.add(product);
        System.out.println("Produk " + product.getProductType() + " ditambahkan ke dalam pesanan.");
    }

    public void createOrder() {
        if (products.isEmpty()) {
            System.out.println("Order gagal, minimal harus 1 produk");
        } else {
            System.out.println("Order berhasil dibuat untuk customer: " + customer.getCustomerName());
        }
    }

    public void editOrder(float newAmount) {
        this.amount = newAmount;
        System.out.println("Total tagihan Order ID: " + this.orderId + " diubah menjadi " + this.amount);
    }

}
