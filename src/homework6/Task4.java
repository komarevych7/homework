package homework6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter line to compare");
        String text = input();
        System.out.println("What do you want to find in text above");
        String match = input();
        int count = countMatches(text, match);
        System.out.println(count);
    }

    public static String input () {
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        return inputText;
    }

    public static int countMatches(String text, String match) {
        int index = 0;
        int count = 0;
        while (true) {
            index = text.indexOf(match, index);
            if (index != -1) {
                count ++;
                index += match.length();
            }
            else {
                break;
            }
        }
        return count;
    }
}
