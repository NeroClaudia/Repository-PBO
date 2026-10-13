public class Customer extends User {
    
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        String file = doc.toLowerCase();

        if (file.endsWith(".jpg") || file.endsWith(".png") || file.endsWith(".pdf")) {
            getProfile().addDocument(doc);
            System.out.println("Verification application submitted");
        }else {
            System.out.println("Invalid document format.");
        }

    }
}
