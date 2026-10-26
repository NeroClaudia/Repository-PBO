public class PegawaiTetap extends Pegawai {
    double gajiPokok;

    public PegawaiTetap(String idPegawai, String nama, double gajiPokok) {
        super(idPegawai, nama);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }
}