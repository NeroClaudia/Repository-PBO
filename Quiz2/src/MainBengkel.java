public class MainBengkel {
    public static void main(String[] args) {

        Employee emp1 = new Employee("EMP-001", "Budi");

        CustomerBengkel cust1 = new CustomerBengkel("Andi Susanto", "081234567890");

        Vehicle car = new Vehicle("B 1234 XYZ", "Toyota", "Avanza", "Car");
        Vehicle motorcycle = new Vehicle("B 2312 GYH", "Honda", "Vario", "Motorcycle");

        cust1.addVehicle(motorcycle);
        cust1.addVehicle(car);

        Service oilChangeCar = new Service("Ganti oli mesin", 300000);
        Service tuneUpMotor = new Service("Tune up lengkap", 100000);

        emp1.processService(cust1.getVehicles().get(0), oilChangeCar);
        emp1.processService(cust1.getVehicles().get(1), tuneUpMotor);

    }
}
