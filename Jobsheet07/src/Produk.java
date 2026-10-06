public class Produk {
    private String kodeProduk, namaProduk;
    private double harga;

    private final double ppn = 0.11;

    public Produk() {
        this.kodeProduk = "PROD-000";
        this.namaProduk = "Produk belum diberi nama";
        this.harga = 0.0;
    }

    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public double hitungTotal(double diskonPersen) {
        double nominalDiskon = harga * (diskonPersen / 100.0);
        double hargaSetelahDiskon = harga - nominalDiskon;
        double totalPpn = hargaSetelahDiskon * ppn;
        return hargaSetelahDiskon + totalPpn;
    }

    public double hitungTotal(double diskonPersen, double potonganNominal) {
        double nominalDiskon = harga * (diskonPersen / 100.0);
        double hargaSetelahDiskon = harga - nominalDiskon - potonganNominal;

        if (hargaSetelahDiskon < 0) {
            hargaSetelahDiskon = 0;
        }

        double totalPpn = hargaSetelahDiskon * ppn;
        return hargaSetelahDiskon + totalPpn;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void infoProduk() {
        System.out.println("Kode produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
