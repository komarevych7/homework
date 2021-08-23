package homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a color");
        String color = scan.nextLine();
        switch (color) {
            case "red":
                System.out.println("Lenght of word " + color + " is 3" ); break;
            case "blue":
                System.out.println("Lenght of word " + color + " is 4" ); break;
            case "green":
                System.out.println("Lenght of word " + color + " is 5" ); break;
            case "yellow":
                System.out.println("Lenght of word " + color + " is 6" ); break;
            case "orange":
                System.out.println("Lenght of word " + color + " is 6" ); break;
            case "black":
                System.out.println("Lenght of word " + color + " is 5" ); break;
            case "white":
                System.out.println("Lenght of word " + color + " is 5" ); break;
            case "pink":
                System.out.println("Lenght of word " + color + " is 4" ); break;
            default:
                System.out.println("Enter correct color"); break;
        }
    }
}
