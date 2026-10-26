public class PegawaiKontrak extends Pegawai {
    double upahPerJam;
    int jamKerja;

    public PegawaiKontrak(String idPegawai, String nama, double upahPerJam, int jamKerja) {
        super(idPegawai, nama);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        return upahPerJam * jamKerja;
    }
}