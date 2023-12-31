package se.sumihiri;

public class User {


    private int id;
    private String name;
    private String email;

    // Constructor in user class
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters in variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
