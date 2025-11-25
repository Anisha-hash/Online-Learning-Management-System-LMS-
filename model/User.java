package model;
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String userType;  // "student" or "instructor"

    public User() {}
    public User(int id, String name, String email, String password, String userType) {
        this.id = id; this.name = name; this.email = email; this.password = password; this.userType = userType;
    }
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    // (Similarly implement other getters and setters)
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "', userType='" + userType + "'}";
    }
}
