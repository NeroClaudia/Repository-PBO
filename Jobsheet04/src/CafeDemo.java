public class CafeDemo {
    public static void main(String[] args) {
        Menu kopiSusu = new Menu("M001", "Kopi Susu", 18000);
        Menu nasiGoreng = new Menu("M002", "Nasi Goreng", 25000);
        Menu esTeh = new Menu("M003", "Es Teh", 8000);

        Pelanggan pelanggan = new Pelanggan("P001", "Budi");

        pelanggan.buatPesanan("ORD001");

        Pesanan pesanan = pelanggan.getPesanan();
        pesanan.tambahMenu(kopiSusu);
        pesanan.tambahMenu(nasiGoreng);
        pesanan.tambahMenu(esTeh);

        System.out.println("=== Nota Sebelum Bayar ===");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        pesanan.cetakNota();

        pesanan.hapusMenu("M003");

        pelanggan.bayarPesanan();

        System.out.println("\n=== Nota Setelah Hapus Menu & Bayar ===");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        pesanan.cetakNota();
    }
}
