public class ProdukMain {
    public static void main(String[] args) {
        System.out.println("--- PENGUJIAN METHOD OVERRIDING ---");
        Produk buku = new Buku("BK-001", "Crime and Punishment", 125000, "Fyodor Dostoevsky");
        Produk elektronik = new Elektronik("EL-001", "Monitor LED 24 inch", 1850000, 12);

        buku.infoProduk();
        System.out.println();
        elektronik.infoProduk();
        System.out.println();

        System.out.println("--- PENGUJIAN METHOD OVERLOADING & FINAL PPN ---");

        // Memanggil hitungTotal versi 1 (hanya diskon persen 10%)
        double totalBuku = buku.hitungTotal(10);
        System.out.println("Total Bayar Buku (Diskon 10% + PPN 11%): Rp " + totalBuku);

        // Memanggil hitungTotal versi 2 (diskon persen 10% + voucher nominal 50.000)
        double totalElektronik = elektronik.hitungTotal(10, 50000);
        System.out.println("Total Bayar Elektronik (Diskon 10% + Potongan Rp 50.000 + PPN 11%): Rp " + totalElektronik);
    }
}