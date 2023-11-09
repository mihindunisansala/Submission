package se.sumihiri;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class UserList {

    public List<User> userList;

    // Constructor
    public UserList() {
        this.userList = new ArrayList<>();
    }

    // Method to add a user
    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> deleteUser(int userId) {
        userList.removeIf(user -> user.getId() == userId);

        public List<User>getUsers () {
            return userList;
        }

        public User searchUserById( int)

        for (User user : userList) {
            if (user.getId() == userId) {
                return (List<User>) user;
            }


            public void sortUsersByName () {
                Collections.sort(userList, Comparator.comparing(User::getName));

            }
        }
    }}


