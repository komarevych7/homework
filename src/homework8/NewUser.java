package homework8;

import java.util.Scanner;

public class NewUser {
    public static void main(String[] args) {

        User user1 = new User("John", 25, "Blocked");
        String user1Name = user1.getName();
        int user1Age = user1.getAge();
        String user1AccountStatus = user1.getAccountStatus();
        System.out.println("Our 1-st user is " + user1Name + ". " + user1Age + " years old. Account status: " + user1AccountStatus);

        User user2 = new User("Mark", "Active");
        String user2Name = user2.getName();
        int user2Age = user2.getAge();
        String user2AccountStatus = user2.getAccountStatus();
        System.out.println("Our 2-nd user is " + user2Name + ". Account status: " + user2AccountStatus);

        User user3 = new User();
        String user3Name = user3.getName();
        int user3Age = user3.getAge();
        String user3AccountStatus = user3.getAccountStatus();
        System.out.println("Our 3-nd user is " + user3Name + ". " + user3Age + " years old. Account status: " + user3AccountStatus);

    }
}
