package homework4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scan.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int attempt = 0;
        int arr[] = new int[size];

        System.out.println("Enter array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        do {

            if (arr[attempt] > 0) {
                positive ++;
            } else if (arr[attempt] < 0) {
                negative ++;
            } else {
                zero ++;
            }
            attempt++;

        } while ( attempt < size );

        System.out.println(" Positive " + positive + " Negative "+ negative + " Zero "+ zero);
    }
}
