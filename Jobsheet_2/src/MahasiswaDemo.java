public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "023432";
        m2.nama = "Yansy Ayuningtyas";
        m2.alamat = "Nias, Sumatera Utara";
        m2.kelas = "2A";

        m3.nim = "023432";
        m3.nama = "Yansy Ayuningtyas";
        m3.alamat = "Nias, Sumatera Utara";
        m3.kelas = "2A";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();

    }
}
