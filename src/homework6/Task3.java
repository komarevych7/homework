package homework6;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a text with didgits to replace it on \"*\"");
        String str = input();
        System.out.println(rowWithoutDidgits(str));
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        String inputField = scan.nextLine();
        return inputField;
    }

    public static String rowWithoutDidgits(String row) {
       // Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        String result = "";
        char[] ch = row.toCharArray();
        for (int i = 0; i < row.length(); i++) {
            if (!Character.isDigit(ch[i])) {
                result = result + ch[i];
            } else {
                result = result + "*";
            }
        } return result;
    }
}
