package homework12;

public enum Dish {
    
    FOIE_GRAS("foie gras", 100, 30){
        public void ingredients() {
            System.out.println("foie gras ingredients texted there");
        }
        public void getCategory(){
            System.out.println("Starter is: " + FOIE_GRAS.name);;
        }
    },
    BEUF_BOURGUIGNON("beuf bourguignon", 150, 33){
        public void ingredients() {
            System.out.println("beuf bourguignon ingredients texted there");
        }
    },
    QUICHE_LORRAINE("quiche lorraine", 130, 15){
        public void ingredients() {
            System.out.println("quiche lorraine ingredients texted there");
        }
        public void getCategory(){
            System.out.println("Second dish is: " + QUICHE_LORRAINE.name);;
        }
    },
    TARTE_TATIN("tarte tatin", 75, 10){
        public void ingredients() {
            System.out.println("tarte tatin ingredients texted there");
        }
        public void getCategory(){
            System.out.println("Desert is: " + TARTE_TATIN.name);;
        }
    };

    public abstract void ingredients();

    public void getCategory(){
        System.out.println("Main Dish is: " + BEUF_BOURGUIGNON.name);;
    }

    private String name;
    private int price;
    private int preparationTime;

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
