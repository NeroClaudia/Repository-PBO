public class Elektronik extends Produk {
    private int masaGaransiBulan;

    public Elektronik() {
        super();
        this.masaGaransiBulan = 0;
    }

    public Elektronik(String kodeProduk, String namaProduk, double harga, int masaGaransiBulan) {
        super(kodeProduk, namaProduk, harga);
        this.masaGaransiBulan = masaGaransiBulan;
    }

    public int getMasaGaransiBulan() {
        return masaGaransiBulan;
    }

    public void setMasaGaransiBulan(int masaGaransiBulan) {
        this.masaGaransiBulan = masaGaransiBulan;
    }

    public void infoElektronik() {
        System.out.println("=== Detail Produk Elektronik ===");
        infoProduk();
        System.out.println("Masa Garansi: " + this.masaGaransiBulan + " Bulan");
    }
}
