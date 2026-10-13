import java.util.ArrayList;

public class UserProfile {
    
    private int userId, age;
    private String password, name, emailId;
    private ArrayList<String> doc;

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public void addDocument(String fileName) {
        String file = fileName.toLowerCase();

        if (file.endsWith(".jpg") || file.endsWith(".png") || file.endsWith(".pdf")) {
            doc.add(fileName);
            System.out.println("Document Added");
        }else {
            System.out.println("Invalid Document Format");
        }
    }

    public void showDocuments() {
        if (doc.isEmpty()) {
            System.out.println("No documents available");
            return;
        }

        for (String filename : doc) {
            System.out.println(filename);
        }
    }
}
