public abstract class Pegawai {
    String idPegawai;
    String nama;

    public Pegawai(String idPegawai, String nama) {
        this.idPegawai = idPegawai;
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + idPegawai + " | Nama: " + nama);
    }

    public abstract double hitungGaji();
}