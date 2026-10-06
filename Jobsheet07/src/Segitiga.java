public class Segitiga {

    int sudut;

    public int totalSudut(int sudutA) {
        return sudut - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA - sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
}