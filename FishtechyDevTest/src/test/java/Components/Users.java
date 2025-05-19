package Components;

public class Users {
    private String id;
    private String fullName;
    private String username;
    private String email;
    private boolean isPublic;

    public Users(String id, String fullName, String username, String email, boolean isPublic) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.isPublic = isPublic;
    }

    // Getters
    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public boolean isPublic() { return isPublic; }

    // Optional: toString
    @Override
    public String toString() {
        return "Users{id='" + id + "', fullName='" + fullName + "', username='" + username + "', email='" + email + "', isPublic=" + isPublic + "}";
    }
}
