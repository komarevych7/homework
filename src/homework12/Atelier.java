package homework12;

public class Atelier{

        public void dressManAtelier(Clothes[] clothes) {
            for (Clothes clothe: clothes) {
                System.out.println(clothe.getType());
                System.out.print("Size: " + clothe.getSize() + " ");
                clothe.sizeDescription(clothe.getSize());
                System.out.println("Price: " + clothe.getPrice() + " uah");
                System.out.println("Color: " + clothe.getColor());
                System.out.println("====================");
            }
        }

        public void dressWomanAtelier(Clothes[] clothes) {
            for (Clothes clothe: clothes) {
                System.out.println(clothe.getType());
                System.out.print("Size: " + clothe.getSize() + " ");
                clothe.sizeDescription(clothe.getSize());
                System.out.println("Price: " + clothe.getPrice() + " uah");
                System.out.println("Color: " + clothe.getColor());
                System.out.println("====================");
            }
        }
}
