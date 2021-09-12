package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter didgits in row without spaces");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int reversed = 0;

        while(i != 0) {
            int digits = i % 10;
            reversed = reversed * 10 + digits;
            i = i / 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
