public class Employee {
    private String employeeId, name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void processService(Vehicle vehicle, Service service) {
        double serviceFee = 0;

        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            serviceFee = 50000;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            serviceFee = 20000;
        }

        double totalCost = service.getServicePrice() + serviceFee;

        System.out.println("======================================");
        System.out.println("    BENGKEL MAJU - SERVICE INFO     ");
        System.out.println("======================================");
        System.out.println("Employee in charge: " + this.name + " (" + this.employeeId + ")");
        System.out.println("Customer Name: " + vehicle.getCustomer().getName());
        System.out.println("Phone Number: " + vehicle.getCustomer().getPhoneNumber());
        System.out.println("======================================");
        System.out.println("Vehicle Detail: " + vehicle.getBrand() + " " + vehicle.getModel() + " ("
                + vehicle.getVehicleType() + ")");
        System.out.println("Plate Number: " + vehicle.getPlateNumber());
        System.out.println("Service Type: " + service.getServiceName());
        System.out.println("======================================");
        System.out.println("Base Service Cost: Rp" + service.getServicePrice());
        System.out.println("Vehicle Fee: Rp" + serviceFee);
        System.out.println("Total: Rp" + totalCost);
        System.out.println("======================================");

    }
}
