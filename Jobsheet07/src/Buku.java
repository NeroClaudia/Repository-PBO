public class Buku extends Produk {
    private String penulis;

    public Buku() {
        super();
        this.penulis = "Penulis Anonim";
    }

    // Overloading
    public Buku(String kodeProduk, String namaProduk, double harga, String penulis) {
        super(kodeProduk, namaProduk, harga);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Overriding
    @Override
    public void infoProduk() {
        System.out.println("=== Detail Produk Buku ===");
        super.infoProduk();
        System.out.println("Penulis: " + penulis);
    }
}
