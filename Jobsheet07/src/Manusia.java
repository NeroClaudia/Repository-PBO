class Manusia {

    public void bernafas() {
        System.out.println("Manusia Sedang Bernafas");
    }

    public void makan() {
        System.out.println("Manusia Sedang Makan");
    }
}

class Dosen extends Manusia {

    @Override
    public void makan() {
        System.out.println("Sedang Makan di ruang dosen");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}

class Mahasiswa extends Manusia {

    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}