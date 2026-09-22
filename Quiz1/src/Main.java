public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Objek
        CustomerBengkel customer1 = new Customer(1, "Budi", "Jl. Merdeka", "0811111");
        Product laptop = new Product(101, 15000000.0f, "Laptop Asus");
        Stock stockLaptop = new Stock(50, 10, laptop);

        System.out.println("--- SEBELUM MODIFIKASI ---");
        System.out.println("No HP Budi: " + customer1.getPhone());
        System.out.println("Harga Laptop: " + laptop.getProductPrice());

        System.out.println("\n--- PROSES MODIFIKASI ---");
        // 2. Menggunakan method edit/modify
        customer1.editCustomer("Jl. Sudirman", "089999999"); // Mengubah HP Budi
        laptop.modifyProduct(14500000.0f, "Laptop Asus (Diskon)"); // Mengubah harga laptop
        stockLaptop.modifyStock(45); // Mengurangi stok karena laku terjual

        System.out.println("\n--- SESUDAH MODIFIKASI ---");
        System.out.println("No HP Budi Sekarang: " + customer1.getPhone());
        System.out.println("Harga Laptop Sekarang: " + laptop.getProductPrice());
    }
}