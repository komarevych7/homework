package homework4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        // System.out.println(number);
        int userNumber = scan.nextInt();

        do {

            if (number == userNumber) {
                System.out.println("True");
                break;
            } else {
                System.out.println("Loh");
                userNumber = scan.nextInt();
            }

        } while (number == userNumber);

    }
}
