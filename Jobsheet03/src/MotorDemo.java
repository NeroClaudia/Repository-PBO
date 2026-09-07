public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";

        int kecekapatanBaru = 50;

        if (!motor1.isMesinOn && kecekapatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecekapatanBaru;
        }
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        kecekapatanBaru = 40;

        if (!motor2.isMesinOn && kecekapatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecekapatanBaru;
        }
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        kecekapatanBaru = 60;

        if (!motor3.isMesinOn && kecekapatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecekapatanBaru;
        }
        motor3.displayStatus();

    }
}
