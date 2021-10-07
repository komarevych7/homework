package homework12;

public enum Dish {
    
    FOIE_GRAS("foie gras"),
    BEUF_BOURGUIGNON("beuf bourguignon"),
    QUICHE_LORRAINE("quiche lorraine"),
    TARTE_TATIN("tarte tatin");

    private String name;
    int price;
    int preparationTime;

    Dish(String name){
        this.name = name;
    }

    Dish(String name, int price){
        this.name = name;
        this.price = price;
    }

    Dish(String name, int price, int preparationTime){
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }
}
