public class ProdukMain {
    public static void main(String[] args) {
        System.out.println("=== Data Objek Awal (Constructor Berparameter) ===");
        Buku buku1 = new Buku("BK-001", "Crime and Punishment", 125000, "Dostoyevsky");
        Elektronik hp1 = new Elektronik("EL-001", "Monitor LED 24 inch", 1850000, 12);

        buku1.infoBuku();
        System.out.println();
        hp1.infoElektronik();
        System.out.println();

        System.out.println("=== Melakukan Modifikasi Atribut ===");
        buku1.setKodeProduk("BK-101-REV");
        buku1.setNamaProduk("Beyond Good and Evil");
        buku1.setHarga(200000);
        buku1.setPenulis("Friedrich Nietzsche");

        hp1.setNamaProduk("Iphone 17");
        hp1.setHarga(30000000);
        hp1.setMasaGaransiBulan(24);

        buku1.infoBuku();
        System.out.println();
        hp1.infoElektronik();
        System.out.println();

        System.out.println("=== Objek Default (Constructor tanpa parameter) ===");
        Buku bukuDefault = new Buku();
        bukuDefault.infoBuku();
    }
}
