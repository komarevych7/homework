package homework4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int n = 0;
        int[] arr = {1, 3, 0, -1, 5, 0, 3};

        do { n++;

            if (arr[n] > 0) {
                positive ++;
            } else if (arr[n] < 0) {
                negative ++;
            } else {
                zero ++;
            }

        } while ( n < size );
        System.out.println(" i " + positive + " j "+ negative + " z "+ zero);
    }
}
