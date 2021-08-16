package homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        int length = str.length();
        System.out.println("Enter max limit in a string");
        int max = scan.nextInt();

        if (length > max) {
            System.out.println("Error");
        } else {
            System.out.println("No error");
        }

    }
}
