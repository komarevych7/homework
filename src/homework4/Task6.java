package homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maximum = scan.nextInt();

        for (int i = 1; i < maximum; i++) {
            for (int j = 0; j <= i; j++ ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
