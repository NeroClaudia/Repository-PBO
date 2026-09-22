public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void addCustomer() {
        System.out.println("Customer Ditambahkan");
    }

    public void editCustomer(String newAddres, String newPhone) {
        this.address = newAddres;
        this.phone = newPhone;
        System.out.println("Data customer berhasil diubah");
    }

    public String getPhone() {
        return this.phone;
    }

    public void deleteCustomer() {
        System.out.println("Customer Dihapus");
    }
}
