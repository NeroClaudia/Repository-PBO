public class Demo {
    public static void main(String[] args) {
        
        System.out.println("=== USER TEST ===");

        User user = new User(101, "secret123", "Nero", 19, "nero@mail.com");

        if (user.logIn(101, "secret123")) {
            System.out.println("Login successfully");

            UserProfile profile = user.getProfile();

            System.out.println("User ID : " + profile.getUserId());
            System.out.println("Name    : " + profile.getName());
            System.out.println("Age     : " + profile.getAge());
            System.out.println("Email   : " + profile.getEmailId());

            profile.editProfile("Nero Claudia", 20, "nero123@mail.com");

            System.out.println("\nAfter editing profile:");
            System.out.println("Name    : " + profile.getName());
            System.out.println("Age     : " + profile.getAge());

            profile.addDocument("identity.jpg");
            profile.addDocument("certificate.pdf");
            profile.addDocument("malware.exe");

            profile.showDocuments();

            user.logOut();
        }else {
            System.out.println("Login Failed");
        }

        System.out.println("\n=== Test Customer ===");

        Customer customer = new Customer(102, "customer123", "Alex", 21, "alex@mail.com");

        if (customer.logIn(102, "customer123")) {
            System.out.println("Customer Login successfully");

            customer.applyVerification("identity.jpg");

            System.out.println("Verification Status: " + customer.getVerificationStatus());

            customer.logOut();
        }

        System.out.println("\n === Test Admin ===");

        Admin admin = new Admin(1, "admin123", "Administrator", 30, "admin@mail.com");

        if (admin.logIn(1, "admin123")) {
            System.out.println("Admin login successfully");

            admin.addVehicle();
            admin.updateVehicle(101);
            admin.retriveComplain();
            admin.verifyUser();

            admin.logOut();
        }else {
            System.out.println("Admin login failed");
        }
    }
}
