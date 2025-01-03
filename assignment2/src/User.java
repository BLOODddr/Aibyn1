public abstract class User {
    private int userId;
    private String name;
    private String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public abstract void displayDetails();

    public String getEmail() {
        return email;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
