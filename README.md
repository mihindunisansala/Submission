# **List of users** 

This project will develop a simple console application that manages a list of users.
The application has written in Java and use object-oriented principles and data structures.

# **Introduction:**
Clean Code is not only about writing code that works, but also about writing code that is easy to read, maintain and understand. When developing the user management application, several Clean Code principles were applied to ensure clarity, simplicity and maintainability. This reflection will discuss how these principles were implemented and their impact on the codebase.

## 1.Meaningful names:
One of the basic Clean Code principles is the use of meaningful and descriptive names for variables, methods and classes. In the User and UserList classes, this principle was applied extensively. For example, the user class attributes were named id, name, and email, which is clear and self-explanatory. The UserList class methods such as addUser, deleteUser and findUserById also follow this principle, making their functionality obvious without having to delve into the implementation.

## 2. Descriptive features:
Clean Code suggests that functions should be small and do one thing. This was applied by breaking the functionality down into small, focused methods. The UserList class methods are concise and serve a specific purpose. For example, the deleteUser method deletes a user based on the specified ID, and the sortUsersByName method sorts the users by name. This ensures that each method is easy to understand and maintains a single responsibility.

## 3. Consistent formatting:
Consistent formatting contributes significantly to code readability. In the user management application, a consistent coding style was maintained throughout the codebase. Indentation, spacing and naming conventions were uniformly applied. This helps developers quickly adapt to the codebase and understand the structure without unnecessary distractions.

## 4. Avoid magic numbers:
   Clean Code recommends avoiding the use of magic numbers by assigning them to named constants. In the User and UserList classes, magic numbers were replaced with named constants. For example, in the UserList class, the value 2 was replaced with userId in the deleteUser method. This improves code readability and makes it easier to understand the intent behind the code.

## 5. Error handling:
   Proper error handling is critical to writing robust and maintainable code. In the User Management Application, error handling was implemented where appropriate. For example, in the findUserById method, if a user with the specified ID is not found, the method returns null. This behavior is documented in the method's comments, providing clarity on the expected results.

## 6. Comments and documentation:
   Clean Code emphasizes the importance of comments and documentation. The codebase contains comments to explain the purpose of classes, methods, and any complex logic. For example, in the README file, there are clear instructions on how to build and run the application in a Linux environment. This documentation is important for developers who may not be familiar with the codebase.

## 7. DRY(don't Repeat Yourself) :
The DRY principle encourages the avoidance of code duplication. In the User Management Application, the UserList class effectively follows this principle. The logic for adding, removing, and retrieving users is encapsulated in well-known methods, eliminating redundancy. This not only makes the code more maintainable, but also reduces the chance of introducing bugs when making changes.

## 8. Unit Testing:
   Clean Code suggests that code be accompanied by unit tests. Although unit tests are not explicitly included in the provided code snippets, the application structure is designed to facilitate testing. The separation of concerns between the User and UserList classes allows for easy isolation and testing of individual components. Implementing unit tests for different scenarios would further improve code reliability.

## 9.Refactoring
Refactor your code regularly. As requirements change and your understanding of the problem domain deepens, adjust your code accordingly. Refactoring helps maintain clean code as the project evolves. Don't be afraid to revisit and improve existing code when necessary.
Initially, this function calculates the total price and applies a fixed discount of 10%. However, as the project evolves, you realize that you need to support variable discounts. To refactor the code to make it more flexible, you can introduce a discount parameter:

## Conclusion:

In summary, the User Management application was developed with a conscious effort to follow Clean Code principles. Meaningful names, descriptive functions, consistent formatting, avoiding magic numbers, proper error handling and documentation were prioritized throughout the development process. The application is structured in a way that promotes readability, maintainability and scalability. Applying Clean Code principles not only improves the current state of the code base, but also lays a foundation for future improvements and collaborations.

## **Build project in a Linux environment** 

### 1.Git clone project using HTTPS / SSH / Github CLI
    git clone https://github.com/mihindunisansala/Submission.git

### 2.Check the folder
    ls 
### 3.Move to  project folder 
    cd submlon (folder)
### 4.Run main Java file using javac command
    javac UsersHandlingTest.java

## **Build project in IntelLiJ IDEA**

1. Pull the code from Github
2. Open the project in IntelLiJ IDEA
3. Run `test/java/UsersHandlingTest`

## Project structure

## Clean code

### What is Clean Code?
Clean code is code that is easy to read, easy to understand, and easy to modify. It is code that is devoid of unnecessary complexity, redundancy, and confusion. Clean code follows a set of conventions and best practices that make it more consistent, making it easier for multiple developers to work on the same project seamlessly.

## Why is Clean Code Important?

### Readability: 
Clean code is easy to read, which means that anyone - including your future self - can understand it quickly. This reduces the time required to grasp the code's functionality, leading to faster development and debugging.

### Maintainability: 
Code is read more often than it is written. When you write clean code, it becomes easier to maintain and extend the application over time. This is crucial in the software development lifecycle, where projects often evolve and grow.

### Collaboration: 
Clean code encourages collaboration. When your code is clean and well-organized, other team members can work on it effectively. This makes it easier to divide tasks and work on different parts of the codebase simultaneously.

### Bug Reduction: 
Clean code reduces the likelihood of introducing bugs. Code that is difficult to understand is more prone to errors during modifications or enhancements.

### Efficiency: 
Clean code is efficient code. It typically runs faster and uses fewer resources because it avoids unnecessary operations and complexity.

**Now that we understand why clean code is important, let's delve into some best practices and principles to help you write clean code.**

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

    // Method to retrieve userlist
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

```

### `UsersHandlingTest.java`
-This file is the entry point and will call the user to manage user list
-This Java console application creates a UserList, adds users, displays them, searches for a user by ID, and sorts users by name. This application can run and to see the results!
-Create the Java console application to test the functionality
### `User.java`
-Project start with the User class
-User class with appropriate attributes, such as id, name, and email.
-Here is uses in constructors to eliminate the confusion between class attributes and parameters with the same name. And Getters and setters are using to protect the data, particularly when creating classes. For each instance variable, a getter method returns its value while a setter method sets or updates its value.

### `UserList.java`
-Create the UserList class
-UserList class that manages a collection of User objects using an appropriate data structure (e.g. an ArrayList). It should include methods for adding, deleting and retrieving users
           
