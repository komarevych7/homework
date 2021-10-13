package homework12;

public class Tie extends Clothes implements MensClothes {

    public Tie (Size size, int price, String color, String type) {
        super(size, price, color, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's Tie");
    }
}
