public class Menu {
    private String kodeMenu;
    private String nama;
    private double harga;

    public Menu(String kodeMenu, String nama, double harga) {
        this.kodeMenu = kodeMenu;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void getInfoMenu() {
        System.out.println("Kode Menu: " + kodeMenu);
        System.out.println("Nama Menu: " + nama);
        System.out.println("Harga Menu: " + harga);
    }
}
