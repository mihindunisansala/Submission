# List of users 

This project will develop a simple console application that manages a list of users.


## Build project in a Linux environment stepby - 

### 1.Git clone project using HTTPS / SSH / Github CLI
    git clone https://github.com/mihindunisansala/Submission.git

### 2.Using 'ls' check the folder
### 3.Move to  project folder 
    cd submlon (folder)
### 4.Run main Java file using javac command
    javac main.java

## *Project in Intelij*

1. Pull the code from Github
2. Open the project in Intellij IDEA
3. Run `main()` from `se.sumihiri.Main`

## Project structure

## Clean code

This code demonstrates using clean code by having descriptive method names such as
The `getUsers()` method returns a copy of the internal list to prevent external modifications. 
The `sortUsersByName()` method utilizes the `Collections.sort` method with a custom comparator to sort users by name.
```
public List<User> getUsers() {
return userList;}

public void addUser(User user) {
        userList.add(user);
    }

    // Method to delete a user
    public void deleteUser(int userId) {
        userList.removeIf(user -> user.getId() == userId);
    }

    // Method to retrieve users
    public List<User> getUsers() {
        return userList;
    }

    // Method to search for a user by ID
    public User searchUserById(int userId) {
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null; // User not found
    }

    // Method to sort users by name
    public void sortUsersByName() {
        Collections.sort(userList, Comparator.comparing(User::getName));
    }
}
```

### `Main.java`
-This file is the entry point and will call the user to manage user list
-This Java console application creates a UserList, adds users, displays them, searches for a user by ID, and sorts users by name. You can run this application to see the results!
-Create the Java console application to test the functionality
### `User.java`
-Project start with the User class
-User class with appropriate attributes, such as id, name, and email.

### `UserList.java`
-Create the UserList class
-UserList class that manages a collection of User objects using an appropriate data structure (e.g. an ArrayList). It should include methods for adding, deleting and retrieving users
           



