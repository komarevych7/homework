package homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a text in a line. Using spaces as delimeters between words");
        reverseLine();
        System.out.println(" - this is your reverted line");
    }


    public static String reverseLine() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String delimeter = " ";
        String[] subStr;
        subStr = str.split(delimeter);
        for (int i = subStr.length - 1; i >= 0; i--) {
            System.out.print(subStr[i] + " ");
        }
        return str;
    }
}
