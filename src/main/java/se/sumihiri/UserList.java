package se.sumihiri;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class UserList {
    private List<User> userList;

    // Constructor
    public UserList() {
        this.userList = new ArrayList<>();
    }

    // Method to add a user
    public void addUser(User user) {
        userList.add(user);
    }

    // Method to delete a user
    public void deleteUser(int userId) {
        userList.removeIf(user -> user.getId() == userId);
    }

    // Method to retrieve userlist
    public List<User> getUsers() {
        return userList;
    }

    // Method to search for a user by ID
    public User searchUserById(int userId) {


        try {
            for (User user : userList) {
                if (user.getId() == userId) {
                    return user;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //  error handling...
        }

        return null;
    }
    // Method to sort users by name
    public void sortUsersByName() {
        Collections.sort(userList, Comparator.comparing(User::getName));
    }
}