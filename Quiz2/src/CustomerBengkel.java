import java.util.ArrayList;
import java.util.List;

public class CustomerBengkel {
    private String name;
    private String phoneNumber;
    private List<Vehicle> vehicles; // Relasi: 1 customer memiliki banyak Vehicle

    public CustomerBengkel(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        vehicle.setCustomer(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}