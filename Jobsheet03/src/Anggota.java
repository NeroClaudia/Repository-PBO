public class Anggota {

    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public int pinjam(int jumlah) {
        if (jumlah > limitPinjaman) {
            System.out.println("Tidak bisa meminjam lebih dari limit peminjaman");
        } else if (jumlah < 0) {
            System.out.println("Meminjam tidak boleh angka negatif");
        } else {
            limitPinjaman -= jumlah;
            jumlahPinjaman += jumlah;
        }
        return jumlahPinjaman;
    }

    public int angsur(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah angsuran harus lebih dari nol");
        } else if (jumlahPinjaman == 0) {
            System.out.println("Tidak ada hutang yang perlu diangsur");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Angsurang melebihi sisa hutang");
        } else {
            jumlahPinjaman -= jumlah;
            limitPinjaman += jumlah;
        }
        return jumlahPinjaman;
    }
}
