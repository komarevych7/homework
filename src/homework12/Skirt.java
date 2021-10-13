package homework12;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt (Size size, int price, String color, String type) {
        super(size, price, color, type);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman's skirt");
    }
}
