package homework12;

public class Tshirt extends Clothes implements MensClothes, WomenClothes{

    public Tshirt (Size size, int price, String color, String type) {
        super(size, price, color, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's T-Shirt");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman's T-Shirt: ");
    }
}
