import org.junit.Test;
import se.sumihiri.User;
import se.sumihiri.UserList;

import java.util.List;

public class UsersHandlingTest {

    UserList userList = new UserList();
    @Test
    public void addUsers(){
        // Adding users
        userList.addUser(new User(1, "Hans Karlsson", "hans@karlsson.com"));
        userList.addUser(new User(2, "Sofia Hultin", "sofia@gmail.com"));
        userList.addUser(new User(3, "Niklas Berg", "nick@gmail.com"));
        System.out.println("\n"+"All the users has been added to the system!");
    }

    // Display All the users at once
    @Test
    public void getAllUsers(){
        addUsers();
        System.out.println("\n"+"User Details:");
        List<User> users = userList.getUsers();
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }

    // Search User by id
    @Test
    public void searchUserById(){
        addUsers();
        int searchUserId = 2;
        User foundUser = userList.searchUserById(searchUserId);
        if (foundUser != null) {
            System.out.println("\n"+"Searched User by ID: " + searchUserId + " has been found.");
            System.out.println("Name: " + foundUser.getName() + ", Email: " + foundUser.getEmail());
        } else {
            System.out.println("User not found.");
        }
    }


    // Sorting users by name
    @Test
    public void sortUsersByNames(){
        addUsers();
        userList.sortUsersByName();
        List<User> users = userList.getUsers();
        System.out.println("\nUsers after sorting by name:"+"\n");
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }
}
