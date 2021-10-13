package homework12;

public class Pants extends Clothes implements MensClothes, WomenClothes{

    public Pants (Size size, int price, String color, String type) {
        super(size, price, color, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's pants");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman's pants");
    }
}
