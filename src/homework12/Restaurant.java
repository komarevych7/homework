package homework12;

public class Restaurant{
    Dish[] dishes = {Dish.FOIE_GRAS, Dish.BEUF_BOURGUIGNON, Dish.QUICHE_LORRAINE, Dish.TARTE_TATIN};

    public void printMenu(){
        for (Dish menu: dishes) {
            menu.getCategory();
            menu.getName();
            menu.getPrice();
            menu.ingredients();
        }
    }

    public void selectDish(Dish dish){
        switch (dish){
            case TARTE_TATIN -> System.out.println(dish.getName() + " is cooking " + dish.getPreparationTime());
            case FOIE_GRAS -> System.out.println(dish.getName() + " is cooking " + dish.getPreparationTime());
            case BEUF_BOURGUIGNON -> System.out.println(dish.getName() + " is cooking " + dish.getPreparationTime());
            case QUICHE_LORRAINE -> System.out.println(dish.getName() + " is cooking " + dish.getPreparationTime());
        }
    }
}
//menu.getName();
        //menu.getPreparationTime();