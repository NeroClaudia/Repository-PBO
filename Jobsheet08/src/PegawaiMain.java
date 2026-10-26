public class PegawaiMain {
    static void main() {
        PegawaiTetap pTetap = new PegawaiTetap("T-001", "Andi", 5000000);
        PegawaiKontrak pKontrak = new PegawaiKontrak("K-001", "Budi", 50000, 100);

        pTetap.tampilkanInfo();
        System.out.println("Gaji Tetap   : Rp " + pTetap.hitungGaji());

        System.out.println("-------------------------");

        pKontrak.tampilkanInfo();
        System.out.println("Gaji Kontrak : Rp " + pKontrak.hitungGaji());
    }
}
