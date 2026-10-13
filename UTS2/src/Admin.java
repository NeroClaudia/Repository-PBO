public class Admin extends User{
    
    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void updateVehicle(int vehicleId) {
        System.out.println("Updating detail for Vehicle ID: " + vehicleId);
    }

    public void addVehicle() {
        System.out.println("Vehicle added successfully");
    }

    public void retriveComplain() {
        System.out.println("Retrivieving customer complaints");
    }

    public void verifyUser() {
        System.out.println("User verfication process started");
    }
}
