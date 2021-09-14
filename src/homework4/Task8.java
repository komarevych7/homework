package homework4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        //System.out.println(number);
        System.out.println("Try to guess a number from 0 to 10");
        int userNumber = scan.nextInt();
        boolean b = false;

        do {

            if ( number == userNumber ) {
                System.out.println("Correctly");
                b = true;
            } else if ( userNumber > 10 || userNumber < 0 ) {
                System.out.println("Number should be from 0 to 10. Try again");
            } else if ( number < userNumber ) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            userNumber = scan.nextInt();

        } while ( b != true);

    }
}
