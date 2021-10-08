package homework12;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.printMenu();
        System.out.println();
        rest.selectDish(Dish.FOIE_GRAS);
    }
}
