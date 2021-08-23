package homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner scan = new Scanner(System.in);

            // registration
        System.out.println("Registration:");
        System.out.println("Enter your login (Can not be empty)");
        username = scan.nextLine();
        int usernameLength = username.length();
        if (usernameLength < 1) {
            System.out.println("Can not be empty. Please try reg again");
        } else {
            System.out.println("Enter your password (Must consist at leat 1 character)");
            password = scan.nextLine();
            int passwordLeng = password.length();
                if (passwordLeng < 1) {
                    System.out.println("Password must consist at least 1 character");
                } else {

                    // login
                    String usernameLogin;
                    String passwordLogin;

                    System.out.println("Login:");
                    System.out.println("Enter your login");
                    usernameLogin = scan.nextLine();
                    System.out.println("Enter your password");
                    passwordLogin = scan.nextLine();
                    if (username.equals(usernameLogin) && password.equals(passwordLogin)) {
                        System.out.println("You successfully logged in");
                    } else {
                        System.out.println("Error");
                    }
                }
        }
    }
}
