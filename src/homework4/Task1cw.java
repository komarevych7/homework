package homework4;

import java.util.Scanner;

public class Task1cw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height");
        int h = scan.nextInt();
        System.out.println("Enter width");
        int w = scan.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
