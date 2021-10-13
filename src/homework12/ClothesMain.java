package homework12;

public class ClothesMain {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        Tshirt tshirt = new Tshirt(Size.S, 100, "blue", "T-Shirt");
        Tshirt tshirt2 = new Tshirt(Size.M, 100, "black", "T-Shirt");
        Pants pants = new Pants(Size.XXS, 200, "White", "Pants");
        Skirt skirt = new Skirt(Size.L, 50, "Grey", "Skirt");
        Tie tie = new Tie(Size.XXS, 10, "white", "Tie");

        Clothes[] close = {tshirt, tshirt2, pants, skirt, tie};
        atelier.dressManAtelier(close);

    }

}
