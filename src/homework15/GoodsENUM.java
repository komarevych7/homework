package homework15;

public enum GoodsENUM {
    KNIFE("knife", 300),
    PISTOL("pistol", 1500),
    RIFLE("rifle", 4000),
    BULLET("bullet", 20),
    GRENADE("grenade", 60);

    private String name;
    private double price;

    GoodsENUM(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

