package se.sumihiri;

import java.util.List;

public class Main {
    public static void main(String[] args) {

            UserList userList = new UserList();

            // Adding users
            userList.addUser(new User(1, "Hans Karlsson", "hans@karlsson.com"));
            userList.addUser(new User(2, "Susan Berg", "susan@gmail.com"));
            userList.addUser(new User(3, "Sofia Hultin", "sofia@gmail.com"));
            // Displayg users
            System.out.println("Users:");
            List<User> users = userList.getUsers();
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
            }
            int searchUserId = 3;
            User foundUser = userList.searchUserById(searchUserId);
            System.out.println("\nSearching for User with ID " + searchUserId + ":");

            if (foundUser != null) {
                System.out.println("User found - Name: " + foundUser.getName() + ", Email: " + foundUser.getEmail());
            } else {
                System.out.println("User not found.");
            }

            // Sorting users by name
            userList.sortUsersByName();
            System.out.println("\nUsers after sorting by name:");
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
            }
    }
}