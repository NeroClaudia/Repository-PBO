public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private Pesanan pesananAktif;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public void buatPesanan(String idPesanan) {
        Pesanan pesanan = new Pesanan(idPesanan);
        this.pesananAktif = pesanan;
    }

    public Pesanan getPesanan() {
        return pesananAktif;
    }

    public String getNama() {
        return nama;
    }

    public void bayarPesanan() {
        if (pesananAktif != null) {
            pesananAktif.setStatusPembayaran(true);
        }
    }
}
