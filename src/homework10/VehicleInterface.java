package homework10;

public interface VehicleInterface {
    void buyNavigator();
    default void navigationPrice(){
        System.out.println("Navigation cost 10$ with default 5\" display");
    }
    default void navigationPrice(int screenSize){
        System.out.println("Navigation cost 15$ with 7\" display");
        System.out.println("Navigation cost 20$ with 9\" display");
    }
    static void navigationDescription(){
        System.out.println("Big display with all maps of Ukraine and Europe for any type of vehicles");
    }
}
