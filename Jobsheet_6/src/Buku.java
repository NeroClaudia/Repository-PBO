public class Buku extends Produk {
    private String penulis;

    public Buku() {
        super();
        this.penulis = "Penulis Anonim";
    }

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

    public void infoBuku() {
        System.out.println("=== Detail Produk Buku ===");
        infoProduk();
        System.out.println("Penulis: " + penulis);
    }
}
