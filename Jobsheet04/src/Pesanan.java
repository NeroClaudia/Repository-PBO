import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private boolean statusPembayaran;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String idPesanan) {
        this.idPesanan = idPesanan;
        this.daftarMenu = new ArrayList<Menu>();
    }

    public void tambahMenu(Menu item) {
        this.daftarMenu.add(item);
    }

    public void hapusMenu(String kodeMenu) {
        daftarMenu.removeIf(m -> kodeMenu.equals(m.getKodeMenu()));
    }

    public double hitungTotal() {
        double total = 0;

        for (Menu m : daftarMenu) {
            total += m.getHarga();
        }

        return total;
    }

    public void cetakNota() {
        System.out.println("Id Pesanan: " + idPesanan);
        System.out.println("Daftar Menu: ");
        for (Menu m : daftarMenu) {
            m.getInfoMenu();
        }
        System.out.println("Total Pembayaran: " + hitungTotal());
        System.out.println("Status Pembayaran: " + (statusPembayaran ? "Lunas" : "Belum Lunas"));
    }

    public void setStatusPembayaran(boolean status) {
        this.statusPembayaran = status;
    }
}
