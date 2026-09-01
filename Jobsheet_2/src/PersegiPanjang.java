public class PersegiPanjang {
    int panjang, lebar;

    public int getLuas() {
        int luas = panjang * lebar;
        return luas;
    }

    public int getKeliling() {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public void displayData() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang: " + getLuas());
        System.out.println("Keliling Persegi Panjang: " + getKeliling());
    }
}
