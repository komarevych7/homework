package homework12;

public abstract class Clothes{
    private Size size;
    private int price;
    private String color;
    private String type;

    public Clothes(Size size, int price, String color, String type) { ;
        this.size = size;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public void sizeDescription (Size size){
        System.out.print("(Euro size: " + size.getEuroSize() + "), ");
        size.getDescription();
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
