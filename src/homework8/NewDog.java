package homework8;

import java.util.Scanner;

public class NewDog {
    public static void main(String[] args) {
        Dog dogName = new Dog("Gomer");
        System.out.println("In our clinic new dog. It is " + dogName);

        Dog.countDodsInClinic();
    }
}
