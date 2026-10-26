public class Lebah extends Hewan{
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampi 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
    }

    @Override
    public void bernapas() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirim oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta: " + kasta);
    }
}
