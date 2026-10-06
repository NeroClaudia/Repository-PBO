public class Elektronik extends Produk {
    private int masaGaransiBulan;

    public Elektronik() {
        super();
        this.masaGaransiBulan = 0;
    }

    // Overloading
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

    // Overriding
    @Override
    public void infoProduk() {
        System.out.println("=== Detail Produk Elektronik ===");
        super.infoProduk();
        System.out.println("Masa Garansi: " + masaGaransiBulan + " Bulan");
    }
}
