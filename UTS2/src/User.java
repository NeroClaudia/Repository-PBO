public class User {

    private UserProfile profile;

    public User(int userId, String password, String name, int age, String emailId) {
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public boolean logIn(int userId, String password) {
        return profile.getUserId() == userId && profile.getPassword().equals(password);
    }

    public void recoverPassword() {
        System.out.println("Password recovery requesting");
    }

    public void logOut() {
        System.out.println("User logged out");
    }

    public UserProfile getProfile() {
        return profile;
    }
}